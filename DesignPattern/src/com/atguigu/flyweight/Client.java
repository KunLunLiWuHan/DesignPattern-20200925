package com.atguigu.flyweight;

public class Client {
	public static void main(String[] args) {
		// ����һ��������
		WebSiteFactory factory = new WebSiteFactory();

		// �ͻ�Ҫһ����������ʽ��������վ
		WebSite webSite1 = factory.getWebSiteCategory("����");
		webSite1.use(new User("tom"));

		// �ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite2 = factory.getWebSiteCategory("����");
		webSite2.use(new User("jack"));
		
		System.out.println("��վ�ķ��๲=" + factory.getWebSiteCount());
	}
}
