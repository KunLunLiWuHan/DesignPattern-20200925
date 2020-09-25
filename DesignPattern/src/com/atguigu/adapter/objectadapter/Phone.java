package com.atguigu.adapter.objectadapter;

public class Phone {
	//充电 适配完成后。传入一个接口，依赖被适配器类Voltage220
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V, 可以充电~~");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("电压大于5V, 不能充电~~");
		}
	}
}
