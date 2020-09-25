package com.atguigu.strategy.improve;

public abstract class Duck {
	//属性, 策略接口
	FlyBehavior flyBehavior;
	//其它属性<->策略接口
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public abstract void display();//显示鸭子信息

	public void quack() {
		System.out.println("鸭子嘎嘎叫~~");
	}

	public void swim() {
		System.out.println("鸭子会游泳~~");
	}

	public void fly() {
		if (flyBehavior != null) { //说明该接口有子类赋值
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
