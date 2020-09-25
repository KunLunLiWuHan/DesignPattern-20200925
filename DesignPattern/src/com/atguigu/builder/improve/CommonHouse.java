package com.atguigu.builder.improve;

/**
 * 具体的建造者
 * 房子属性封装到House中，制作过程封装在本类中，将制作流程和产品本身拆解
 */
public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println(" 普通房子打地基5米 ");
	}

	@Override
	public void buildWalls() {
		System.out.println(" 普通房子砌墙10cm ");
	}

	@Override
	public void roofed() {
		System.out.println(" 普通房子屋顶 ");
	}
}
