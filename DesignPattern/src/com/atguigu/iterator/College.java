package com.atguigu.iterator;

import java.util.Iterator;

public interface College {
	String getName();

	//����ϵ�ķ���
	void addDepartment(String name, String desc);

	//���ķ�����Ҫ����һ��������,����
	Iterator createIterator();
}