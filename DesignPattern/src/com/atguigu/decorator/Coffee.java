package com.atguigu.decorator;

public class Coffee extends Drink {
	//单品咖啡就是它的价格
	@Override
	public float cost() {
		return super.getPrice();
	}
}
