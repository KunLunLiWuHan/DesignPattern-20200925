package com.atguigu.strategy.improve;

public class Client {
	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//

		//��̬�ı�ĳ���������Ϊ, ҰѼ ���ܷ�
		wildDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("ҰѼ��ʵ�ʷ�������");
		wildDuck.fly();
	}
}
