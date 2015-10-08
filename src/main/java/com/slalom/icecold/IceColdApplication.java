package com.slalom.icecold;

import com.mongodb.MongoClient;
import com.slalom.icecold.domain.UserAccount;
import com.slalom.icecold.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@SpringBootApplication
@Configuration
@ComponentScan("com.slalom.icecold")
@EnableAutoConfiguration( )
//Comment out the above line and uncomment below when disable security
//@EnableAutoConfiguration(exclude = { org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class })
public class IceColdApplication {

//    @Value("${db.mongo.database}")
//    private String mongoDatabase;
//    @Value("${db.mongo.host}")
//    private String mongoHost;
//    @Value("${db.mongo.username:''}")
//    private String username;
//    @Value("${db.mongo.password:''}")
//    private String password;

    public static void main(String[] args) {

        SpringApplication.run(IceColdApplication.class, args);
    }

//    @Bean
//    public MongoDbFactory mongoDbFactory() throws Exception {
//
//        return new SimpleMongoDbFactory(new MongoClient(mongoHost), mongoDatabase);
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        return new MongoTemplate(mongoDbFactory());
//    }

}

//Comment out the following two WebSecurityConfig classes to disable Spring security
///*
@Configuration
class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Autowired
    UserRepository userRepository;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }

    @Bean
    UserDetailsService userDetailsService() {
        return new UserDetailsService() {

            @Override
            public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
                UserAccount userAccount = userRepository.findUserByUserName(userName);
                if(userAccount != null) {
                    return new User(userAccount.getUserName(), userAccount.getPassword(), true, true, true, true,
                            AuthorityUtils.createAuthorityList("USER"));
                } else {
                    throw new UsernameNotFoundException("could not find the user '" + userName + "'");
                }
            }

        };
    }
}

@EnableWebSecurity
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().fullyAuthenticated().and().
                httpBasic().and().
                csrf().disable();
    }

}
//*/