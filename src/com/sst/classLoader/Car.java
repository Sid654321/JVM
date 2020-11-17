package com.sst.classLoader;

public class Car {
	int id;
	String name;
	public static void main(String[] args) {
		/*
		 * 这三个对象各不相同，其中，car1，car2，car3的引用存放在栈中
		 * 引用所指的对象存放在堆中
		 */
		Car car1 = new Car();//由类对象生成类模板
		Car car2 = new Car();//由类对象生成类模板
		Car car3 = new Car();//由类对象生成类模板
		
		/*
		 * 这三个类对象全部相同，是同一个类对象
		 */
		Class<? extends Car> aclass1 = car1.getClass();//由对象返回类模板
		Class<? extends Car> aclass2 = car2.getClass();
		Class<? extends Car> aclass3 = car3.getClass();
		
		
		ClassLoader loader1 = aclass1.getClassLoader();
		System.out.println(loader1);                //sun.misc.Launcher$AppClassLoader@73d16e93
		System.out.println(loader1.getParent());    //sun.misc.Launcher$ExtClassLoader@15db9742
		System.out.println(loader1.getParent().getParent());//null 由c，c++写的   bootstrap（引导程序）
	}

}
