package com.atguigu.facade;

/**
 * ���ģʽ
 */
public class Client {
	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		//�õ�����࣬��ѡ��ص��÷���
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		homeTheaterFacade.end();
	}
}
