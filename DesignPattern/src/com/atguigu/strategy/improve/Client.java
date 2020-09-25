package com.atguigu.strategy.improve;

public class Client {
	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//

		//动态改变某个对象的行为, 野鸭 不能飞
		wildDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("野鸭的实际飞翔能力");
		wildDuck.fly();
	}
}
