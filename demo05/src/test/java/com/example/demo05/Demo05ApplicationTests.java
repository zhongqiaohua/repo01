package com.example.demo05;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo05ApplicationTests {

	@Test
	void contextLoads() {
		String str = "37,739,80,75,38,47,32,67,986,37,80,80,75,38,47,39,235,75";
		System.out.println(str.substring(str.length()-1,str.length())+"@@@@@-");
//		for (int i = 0;i<str.length()-2;i++) {
//			System.out.println(str.substring(i,i+2)+"---");
//			System.out.println(str.substring(i+2)+"+++");
//		}
	}

}
