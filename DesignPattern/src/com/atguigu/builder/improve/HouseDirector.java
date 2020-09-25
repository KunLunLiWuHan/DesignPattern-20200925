package com.atguigu.builder.improve;

//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {
	//属性，拥有一个build
	HouseBuilder houseBuilder = null;

	//方式1：构造器传入 houseBuilder（houseBuilder传入的两种方式）
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//方式2：通过setter 传入 houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//如何处理建造房子的流程，交给指挥者
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
}
