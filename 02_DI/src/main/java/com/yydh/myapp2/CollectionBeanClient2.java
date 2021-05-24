package com.yydh.myapp2;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient2 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext4.xml");
		CollectionBean2 bean = (CollectionBean2)context.getBean("collectionBean");
		Map<String, String> list = bean.getAddressList();
		for(String add : list.keySet()) {
			String value = (String) list.get(add);
			System.out.println(add + " : " + value);
		}
	}
	
}
