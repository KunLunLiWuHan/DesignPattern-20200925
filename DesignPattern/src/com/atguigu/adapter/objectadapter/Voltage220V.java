package com.atguigu.adapter.objectadapter;

/**
 * ����������
 * �������г����������������������������������൱��Adapter��220V������
 * �൱��src (����������)�����ǵ�Ŀdst(��Ŀ��)��5Vֱ���磬ʹ�ö���������ģ
 * ʽ��ɡ�
 */
//���������
public class Voltage220V {
	//���220V�ĵ�ѹ������
	public int output220V() {
		int src = 220;
		System.out.println("��ѹ=" + src + "��");
		return src;
	}
}
