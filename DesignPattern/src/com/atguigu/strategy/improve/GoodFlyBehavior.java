package com.atguigu.strategy.improve;

//针对飞行有不同的策略
public class GoodFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" 飞翔技术高超 ~~~");
	}
}
