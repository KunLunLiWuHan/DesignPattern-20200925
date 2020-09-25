package com.atguigu.principle.inversion.improve;

public class DependencyPass {
	public static void main(String[] args) {
		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);

		//ͨ�������������������ݣ������һ�б�ʾ�Ѿ�����������ȥ�ˣ�
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();

		//ͨ��setter����������������
		OpenAndClose openAndClose = new OpenAndClose();
		//��changHong���ݽ�����
		openAndClose.setTv(changHong);
		openAndClose.open();
	}
}

// ��ʽ1�� ͨ���ӿڴ���ʵ������
//		 ���صĽӿ�
//interface IOpenAndClose {
//	void open(ITV tv); //���󷽷�,���սӿ�
//}

//ITV�ӿ�
//interface ITV {
//	void play();
//}
//
//// ʵ�ֽӿ�
//class OpenAndClose implements IOpenAndClose {
//	//���ӿ�ITV���������ͽӿ�ITV��������
//	public void open(ITV tv) {
//		tv.play();
//	}
//}
//
class ChangHong implements ITV {
	@Override
	public void play() {
		System.out.println("������ӻ�����");
	}
}

// ��ʽ2: ͨ�����췽����������
//interface IOpenAndClose {
//	void open(); //���󷽷�
//}
//
//interface ITV { //ITV�ӿ�
//	void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	public ITV tv; //�ӿڳ�Ա
//
//	public OpenAndClose(ITV tv) { //������
//		this.tv = tv;
//	}
//
//	public void open() {
//		this.tv.play();
//	}
//}


// ��ʽ3 , ͨ��setter��������
interface IOpenAndClose {
	void open(); // ���󷽷�

	void setTv(ITV tv);
}

interface ITV { // ITV�ӿ�
	void play();
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;

	public void setTv(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}
