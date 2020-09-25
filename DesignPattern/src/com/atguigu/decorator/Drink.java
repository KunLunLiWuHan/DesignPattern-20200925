package com.atguigu.decorator;

/**
 * 装饰者模式
 */
public abstract class Drink {
	public String des; // 描述
	private float price = 0.0f; //价格

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//核心方法-计算费用的抽象方法
	//子类（这样才可以计算出价格）来实现
	public abstract float cost();
}
