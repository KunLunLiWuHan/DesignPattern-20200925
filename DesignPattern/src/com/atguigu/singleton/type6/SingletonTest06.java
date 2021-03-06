package com.atguigu.singleton.type6;

public class SingletonTest06 {
	public static void main(String[] args) {
		System.out.println("双重检查");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

// 懒汉式(线程安全，同步方法)
class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
	}
	//提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
	//同时保证了效率, 推荐使用
	public static Singleton getInstance() {
		if (instance == null) {
			/**
			 * 假设a,b同时通过if (instance == null) 进入下面的静态代码块，假设进程a先获取
			 * 锁，此时b等待；当a创建对象完成之后，释放锁，b进入，但是进入后发现if (instance ！= null)
			 * 就很快退出。
			 * 在大if()之外的代码此时不会符合条件，直接返回instance。
			 * 同步的是类对象,在不同线程中,只要是这个类的对象都会同步等待。
			 */
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
