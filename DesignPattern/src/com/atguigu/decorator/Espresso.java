package com.atguigu.decorator;

//单品咖啡
public class Espresso extends Coffee {
	//构造器-在创建Espresso时将价格和描述给它
	public Espresso() {
		setDes(" 意大利咖啡 ");
		setPrice(6.0f);
	}
}
