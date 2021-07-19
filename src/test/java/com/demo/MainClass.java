package com.demo;

import com.demo.entity.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//A a = (A) context.getBean("a");
		System.out.println(context.getBean("a").getClass().toString());
		System.out.println(context.getBean("b").getClass().toString());
	}
}
