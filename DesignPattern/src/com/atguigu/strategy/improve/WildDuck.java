package com.atguigu.strategy.improve;

public class WildDuck extends Duck {
	//������������FlyBehavor �Ķ���
	public WildDuck() {
		//��������ĸ�ʽ��д
		flyBehavior = new GoodFlyBehavior();
	}

	@Override
	public void display() {
		System.out.println(" ����ҰѼ ");
	}
}
