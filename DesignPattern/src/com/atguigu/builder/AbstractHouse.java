package com.atguigu.builder;

/**
 * @time 2020.09.22
 * @desc ԭ��ģʽ
 */
public abstract class AbstractHouse {
	//��ػ�
	public abstract void buildBasic();
	//��ǽ
	public abstract void buildWalls();
	//�ⶥ
	public abstract void roofed();
	
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}
}
