package com.atguigu.template.improve;

//������
public class PureSoyaMilk extends SoyaMilk {
	@Override
	void addCondiments() {
		//��ʵ�֣������κε���
	}

	//���ӷ��������ǵ������еķ���
	@Override
	boolean customerWantCondiments() {
		return false;
	}
}
