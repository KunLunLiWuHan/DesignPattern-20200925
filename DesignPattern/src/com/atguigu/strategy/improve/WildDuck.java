package com.atguigu.strategy.improve;

public class WildDuck extends Duck {
	//构造器，传入FlyBehavor 的对象
	public WildDuck() {
		//按照下面的格式书写
		flyBehavior = new GoodFlyBehavior();
	}

	@Override
	public void display() {
		System.out.println(" 这是野鸭 ");
	}
}
