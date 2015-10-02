package com.slalom.icecold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration( )
@ComponentScan("com.slalom.icecold")
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
