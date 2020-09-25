package com.atguigu.iterator;

import java.util.Iterator;

public interface College {
	String getName();

	//增加系的方法
	void addDepartment(String name, String desc);

	//核心方法是要返回一个迭代器,遍历
	Iterator createIterator();
}
