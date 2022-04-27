package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext cntob=new ClassPathXmlApplicationContext("spring.xml");
		Product pob=(Product) cntob.getBean("prodob");
		pob.displayproducts();

	}

}
