package com.yydh.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
/*
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
*/
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationcontext.xml");
		
		TV tv1 = (TV)factory.getBean("tv");

		
//		TV tv2 = (TV)factory.getBean("tv");
//
//		TV tv3 = (TV)factory.getBean("tv");
//
//		TV tv4 = (TV)factory.getBean("tv");

		factory.close();
	}
	
}
