package com.atguigu.mediator.smarthouse;

public class ClientTest {
	public static void main(String[] args) {
		//����һ���н��߶���
		Mediator mediator = new ConcreteMediator();

		//����Alarm ���Ҽ��뵽  ConcreteMediator �����HashMap
		Alarm alarm = new Alarm(mediator, "alarm");

		//������CoffeeMachine ���󣬲��Ҽ��뵽  ConcreteMediator �����HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

		//�����ӷ�����Ϣ
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}
}
