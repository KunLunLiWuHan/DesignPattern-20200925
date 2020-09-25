package com.atguigu.decorator;

/**
 * @time: 2020-09-23 10:16
 * @author: likunlun
 * @description: 用户点餐
 */
public class Client {
	public static void main(String[] args) {
		//装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack
		//1、点一份LongBlack
		Drink order = new LongBlack();
		System.out.println("费用1：" + order.cost());
		System.out.println("描述：" + order.getDes());

		//2、order中加入一份牛奶
		order = new Milk(order);
		//3、order中加入一份巧克力
		order = new Chocolate(order);
		//4、order中再加入一份巧克力
		order = new Chocolate(order);

		// 13 = 5+ 2 + 3 + 3
		System.out.println("总费用：" + order.cost());
		//巧克力  3.0 &&  巧克力  3.0 &&  牛奶  2.0 &&  longblack
		System.out.println("描述：" + order.getDes());
	}
}
