package com.atguigu.builder;

/**
 * @time 2020.09.22
 * @desc 原型模式
 */
public abstract class AbstractHouse {
	//打地基
	public abstract void buildBasic();
	//砌墙
	public abstract void buildWalls();
	//封顶
	public abstract void roofed();
	
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}
}
