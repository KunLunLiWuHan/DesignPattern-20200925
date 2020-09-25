package com.atguigu.builder.improve;

/**
 * ����Ľ�����
 * �������Է�װ��House�У��������̷�װ�ڱ����У����������̺Ͳ�Ʒ������
 */
public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println(" ��ͨ���Ӵ�ػ�5�� ");
	}

	@Override
	public void buildWalls() {
		System.out.println(" ��ͨ������ǽ10cm ");
	}

	@Override
	public void roofed() {
		System.out.println(" ��ͨ�����ݶ� ");
	}
}
