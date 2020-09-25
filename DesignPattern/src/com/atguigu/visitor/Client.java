package com.atguigu.visitor;

public class Client {
	public static void main(String[] args) {
		//创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();

		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());

		//成功
		Success success = new Success();
		/**
		 *  男人给的评价该歌手很成功 !
		 *  女人给的评价该歌手很成功 !
		 */
		objectStructure.display(success);





		System.out.println("=======失败测评========");
		Fail fail = new Fail();
		objectStructure.display(fail);

		System.out.println("=======给的是待定的测评========");

		Wait wait = new Wait();
		objectStructure.display(wait);
	}
}
