package com.atguigu.observer.improve;

public class Client {
	public static void main(String[] args) {
		//����һ��WeatherData
		WeatherData weatherData = new WeatherData();

		//�����۲���
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();

		//ע�ᵽweatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);

		//����
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);

		System.out.println("----------------------------------");
		weatherData.removeObserver(currentConditions);
		//����
		System.out.println();
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);
	}
}