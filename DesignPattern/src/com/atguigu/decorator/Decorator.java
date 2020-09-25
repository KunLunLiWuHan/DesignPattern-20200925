package com.atguigu.decorator;

//װ����
public class Decorator extends Drink {
	//���ӿڼ̳к����
	private Drink obj;

	public Decorator(Drink obj) { //���
		this.obj = obj;
	}

	@Override
	public float cost() {
		// getPrice �Լ��۸񡣽���Ʒ���ȵļܹ�ҲҪͳ�ƽ�ȥ
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes() �����װ���ߵ���Ϣ
		return super.des + " " + getPrice() + " && " + obj.getDes();
	}
}
