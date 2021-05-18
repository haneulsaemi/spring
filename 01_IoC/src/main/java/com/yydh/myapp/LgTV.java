package com.yydh.myapp;

public class LgTV implements TV{
	@Override
	public void powerOff() {
		System.out.println("LgTV---전원을켠다");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV---전원을끈다");
	}
	@Override
	public void volumDown() {
		System.out.println("LgTV---볼륨을높인다.");
	}
	@Override
	public void volumUp() {
		System.out.println("LgTV---볼륨을줄이다.");
	}
}
