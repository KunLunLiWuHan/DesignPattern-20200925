package com.atguigu.adapter.objectadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println(" === ����������ģʽ ====");
		Phone phone = new Phone();
		//��ɳ������
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}
}
