package com.atguigu.memento.theory;

public class Memento {
	private String state;

	//������ ��state�ŵ�������ȥ
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
