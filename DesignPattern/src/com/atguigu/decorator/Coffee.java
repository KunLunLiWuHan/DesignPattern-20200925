package com.atguigu.decorator;

public class Coffee extends Drink {
	//��Ʒ���Ⱦ������ļ۸�
	@Override
	public float cost() {
		return super.getPrice();
	}
}
