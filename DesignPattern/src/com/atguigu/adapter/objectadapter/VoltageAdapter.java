package com.atguigu.adapter.objectadapter;

/**
 * 只是将Adapter类作修改，不是继承src类，而
 * 是持有src类的实例，以解决兼容性的问题。 即：持有 src类，实现 dst 类接口，
 * 完成src->dst的适配
 */
//适配器类 拿到220v电压，变成5V
public class VoltageAdapter implements IVoltage5V {
	//持有src类的实例
	private Voltage220V voltage220V; // 关联关系-聚合

	//通过构造器，传入一个 Voltage220V 实例
	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if (null != voltage220V) {
			int src = voltage220V.output220V();//获取220V 电压
			System.out.println("使用对象适配器，进行适配~~");
			dst = src / 44;
			System.out.println("适配完成，输出的电压为=" + dst);
		}
		return dst;
	}
}
