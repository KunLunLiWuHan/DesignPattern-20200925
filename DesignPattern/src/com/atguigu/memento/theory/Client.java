package com.atguigu.memento.theory;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator(); //����һ��ԭ������
		Caretaker caretaker = new Caretaker();
		
		originator.setState(" ״̬#1 ������ 100 "); //����״̬
		
		//�����˵�ǰ��״̬
		caretaker.add(originator.saveStateMemento());

		//����״̬2
		originator.setState(" ״̬#2 ������ 80 ");
		caretaker.add(originator.saveStateMemento());

		System.out.println("��ǰ��״̬�� =" + originator.getState());
		
		//ϣ���õ�״̬ 1, �� originator �ָ���״̬1
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("�ָ���״̬1 , ��ǰ��״̬��");
		System.out.println("��ǰ��״̬�� =" + originator.getState());
	}
}
