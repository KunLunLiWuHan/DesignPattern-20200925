package com.atguigu.facade;

/**
 * 外观模式
 */
public class Client {
	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		//拿到外观类，有选择地调用方法
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		homeTheaterFacade.end();
	}
}
