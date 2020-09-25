package com.atguigu.adapter.objectadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println(" === 对象适配器模式 ====");
		Phone phone = new Phone();
		//完成充电任务
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}
}
