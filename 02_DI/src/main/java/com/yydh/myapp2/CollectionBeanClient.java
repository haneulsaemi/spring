package com.yydh.myapp2;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext3.xml");
		CollectionBean bean = (CollectionBean)context.getBean("collectionBean");
		Set<String> list = bean.getAddressList();
		for(String s : list) {
			System.out.println(s);
		}
	}
	
}
