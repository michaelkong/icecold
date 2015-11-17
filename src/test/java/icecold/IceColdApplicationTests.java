package icecold;

import com.slalom.icecold.IceColdApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = IceColdApplication.class)
@WebAppConfiguration
public class IceColdApplicationTests {

	private MockMvc mvc;

	@Test
	public void contextLoads() {
	}

//	@Before
//	public void setUp() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
//	}
//
//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("Greetings from Spring Boot!")));
//	}
}

