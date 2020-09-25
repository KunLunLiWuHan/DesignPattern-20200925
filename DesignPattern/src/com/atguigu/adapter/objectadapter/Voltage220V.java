package com.atguigu.adapter.objectadapter;

/**
 * 对象适配器
 * 以生活中充电器的例子来讲解适配器，充电器本身相当于Adapter，220V交流电
 * 相当于src (即被适配者)，我们的目dst(即目标)是5V直流电，使用对象适配器模
 * 式完成。
 */
//被适配的类
public class Voltage220V {
	//输出220V的电压，不变
	public int output220V() {
		int src = 220;
		System.out.println("电压=" + src + "伏");
		return src;
	}
}
