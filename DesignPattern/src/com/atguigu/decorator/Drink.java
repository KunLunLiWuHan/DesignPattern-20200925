package com.atguigu.decorator;

/**
 * װ����ģʽ
 */
public abstract class Drink {
	public String des; // ����
	private float price = 0.0f; //�۸�

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

	//���ķ���-������õĳ��󷽷�
	//���ࣨ�����ſ��Լ�����۸���ʵ��
	public abstract float cost();
}