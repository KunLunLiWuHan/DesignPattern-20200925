package com.atguigu.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
	//����������ҪDepartment ���������ķ�ʽ���=>����
	Department[] departments;
	int position = 0; //������λ��

	//������ ��departments������
	public ComputerCollegeIterator(Department[] departments) {
		this.departments = departments;
	}

	//�ж��Ƿ�����һ��Ԫ��
	@Override
	public boolean hasNext() {
		//����ķ�ʽ�ж���û����һ��
		if (position >= departments.length || departments[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Department department = departments[position];
		position += 1;
		return department;
	}

	//ɾ���ķ�������ʱ����Ҫ����Ĭ�Ͽ�ʵ��
	public void remove() {
	}
}