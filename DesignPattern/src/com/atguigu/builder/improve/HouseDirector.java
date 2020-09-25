package com.atguigu.builder.improve;

//ָ���ߣ�����ȥָ���������̣����ز�Ʒ
public class HouseDirector {
	//���ԣ�ӵ��һ��build
	HouseBuilder houseBuilder = null;

	//��ʽ1������������ houseBuilder��houseBuilder��������ַ�ʽ��
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//��ʽ2��ͨ��setter ���� houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//��δ����췿�ӵ����̣�����ָ����
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
}
