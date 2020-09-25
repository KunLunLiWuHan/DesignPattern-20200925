package com.atguigu.decorator;

//装饰者
public class Decorator extends Drink {
	//将接口继承和组合
	private Drink obj;

	public Decorator(Drink obj) { //组合
		this.obj = obj;
	}

	@Override
	public float cost() {
		// getPrice 自己价格。将单品咖啡的架构也要统计进去
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes() 输出被装饰者的信息
		return super.des + " " + getPrice() + " && " + obj.getDes();
	}
}
