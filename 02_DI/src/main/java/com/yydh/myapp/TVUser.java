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
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");
		
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		factory.close();
	}
	
}
