package com.oguzhanun.springboot.thymleaf;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThymleafApplicationTests {

	@Test
	public void contextLoads() {
		
		Integer i = 5;
		Integer z = 3;
		
		z= z + 2;
		
		assertThat(z).isEqualTo(i);
	}

}
