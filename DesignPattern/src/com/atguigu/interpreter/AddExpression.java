package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * �ӷ�������
 */
public class AddExpression extends SymbolExpression {
	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	//�������
	//var ��Ȼ�� {a=10,b=20}..
	public int interpreter(HashMap<String, Integer> var) {
		//var.toString() -> {a=10, b=20}
		System.out.println("var"+var.toString());
		//super.left.interpreter(var) �� ���� left ���ʽ��Ӧ��ֵ a = 10
		//super.right.interpreter(var): ����right ���ʽ��Ӧֵ b = 20
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
