package com.atguigu.decorator;

/**
 * @time: 2020-09-23 10:16
 * @author: likunlun
 * @description: �û����
 */
public class Client {
	public static void main(String[] args) {
		//װ����ģʽ�µĶ�����2���ɿ���+һ��ţ�̵�LongBlack
		//1����һ��LongBlack
		Drink order = new LongBlack();
		System.out.println("����1��" + order.cost());
		System.out.println("������" + order.getDes());

		//2��order�м���һ��ţ��
		order = new Milk(order);
		//3��order�м���һ���ɿ���
		order = new Chocolate(order);
		//4��order���ټ���һ���ɿ���
		order = new Chocolate(order);

		// 13 = 5+ 2 + 3 + 3
		System.out.println("�ܷ��ã�" + order.cost());
		//�ɿ���  3.0 &&  �ɿ���  3.0 &&  ţ��  2.0 &&  longblack
		System.out.println("������" + order.getDes());
	}
}
