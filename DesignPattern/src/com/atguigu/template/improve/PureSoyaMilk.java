package com.atguigu.template.improve;

//纯豆浆
public class PureSoyaMilk extends SoyaMilk {
	@Override
	void addCondiments() {
		//空实现，不叫任何调料
	}

	//钩子方法，覆盖掉父类中的方法
	@Override
	boolean customerWantCondiments() {
		return false;
	}
}
