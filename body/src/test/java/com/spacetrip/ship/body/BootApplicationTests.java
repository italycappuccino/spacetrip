package com.spacetrip.ship.body;

import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class BootApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(JSON.toJSONString(Arrays.asList("hello", "world")));
	}

}
