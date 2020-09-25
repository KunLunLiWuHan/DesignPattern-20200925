package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

//ѧԺ-Composite
public class College extends OrganizationComponent {
	//List �� ��ŵ�Department
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

	// ������
	public College(String name, String des) {
		super(name, des);
	}

	// ��дadd
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		//����ʵ��ҵ���У�college��add��university��add��һ��һ��
		organizationComponents.add(organizationComponent);
	}

	// ��дremove
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	// print�������������University ������ѧԺ
	@Override
	protected void print() {
		System.out.println("--------------" + getName() + "--------------");
		//���� organizationComponents ��ŵ���department�������department��print()����
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}