package com.atguigu.principle.inversion.improve;

public class DependencyPass {
	public static void main(String[] args) {
		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);

		//通过构造器进行依赖传递（下面第一行表示已经将依赖传进去了）
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();

		//通过setter方法进行依赖传递
		OpenAndClose openAndClose = new OpenAndClose();
		//将changHong传递进里面
		openAndClose.setTv(changHong);
		openAndClose.open();
	}
}

// 方式1： 通过接口传递实现依赖
//		 开关的接口
//interface IOpenAndClose {
//	void open(ITV tv); //抽象方法,接收接口
//}

//ITV接口
//interface ITV {
//	void play();
//}
//
//// 实现接口
//class OpenAndClose implements IOpenAndClose {
//	//将接口ITV传进来，和接口ITV发生依赖
//	public void open(ITV tv) {
//		tv.play();
//	}
//}
//
class ChangHong implements ITV {
	@Override
	public void play() {
		System.out.println("长虹电视机，打开");
	}
}

// 方式2: 通过构造方法依赖传递
//interface IOpenAndClose {
//	void open(); //抽象方法
//}
//
//interface ITV { //ITV接口
//	void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	public ITV tv; //接口成员
//
//	public OpenAndClose(ITV tv) { //构造器
//		this.tv = tv;
//	}
//
//	public void open() {
//		this.tv.play();
//	}
//}


// 方式3 , 通过setter方法传递
interface IOpenAndClose {
	void open(); // 抽象方法

	void setTv(ITV tv);
}

interface ITV { // ITV接口
	void play();
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;

	public void setTv(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}
