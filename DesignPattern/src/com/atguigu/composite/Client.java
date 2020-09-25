package com.atguigu.composite;

public class Client {

	public static void main(String[] args) {

		//�Ӵ�С�������� ѧУ
		OrganizationComponent university = new University("�廪��ѧ", " �й�������ѧ ");

		//����ѧԺ
		OrganizationComponent computerCollege = new College("�����ѧԺ", " �����ѧԺ ");
		OrganizationComponent infoEngineercollege = new College("��Ϣ����ѧԺ", " ��Ϣ����ѧԺ ");


		//��������ѧԺ�����ϵ(רҵ)
		computerCollege.add(new Department("�������", " ������̲��� "));
		computerCollege.add(new Department("���繤��", " ���繤�̲��� "));

		infoEngineercollege.add(new Department("ͨ�Ź���", " ͨ�Ź��̲���ѧ "));
		infoEngineercollege.add(new Department("��Ϣ����", " ��Ϣ���̺�ѧ "));

		//��ѧԺ���뵽 ѧУ
		university.add(computerCollege);
		university.add(infoEngineercollege);

		//��ӡ���
		university.print();
//		computerCollege.print();
	}
}
