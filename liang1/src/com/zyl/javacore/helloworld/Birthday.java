package com.zyl.javacore.helloworld;

public class Birthday {
	private int day;
	private int month;
	private int year;
	/**
	 * 值传递，参数为基本类型
	 * @param year
	 * @param month
	 * @param day
	 */
public void display(int year,int month,int day){
	day = 11; month = 11; year = 2015;
	System.out.println("传递方法中：" + year + "-" + month +"-" + day);
}
/**
 * 引用传递，传递的是引用类型
 * @param birthday
 */
public void display(Birthday birthday){
	birthday.year = 2012;
	birthday.month = 12;
	birthday.day = 12;
	System.out.println("传递方法中：" + birthday.year + "-" + birthday.month + "-" +birthday.day );
}
//值传递测试
public static void testValue1(){
	Birthday birthday = new Birthday();
	//定义三个基本类型的变量，分别是日，月，年
	int day = 12, month = 12, year = 2016;
	//传递之前打印的这是哪个变量的值
	System.out.println("传递之前：" + year + "-" + month + "-" + day);
	//传递三个基本类型的变量到display方法中，并在方法中，改变着三个变量的值
	birthday.display(year,month,day);
	//传递之后，在打印这三个变量的值
	System.out.println("传递之后：" + year + "-" + month + "-" + day);
}
//引用传递测试
public static void testValue2(){
	Birthday birthday = new Birthday();
	birthday.day = 3;
	birthday.month = 3;
	birthday.year = 2016;
	
	//传递之前打印birthday对象值
	System.out.println("传递之前：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
	//传递birthday对象到display方法中，并在方法中，改变birthday对象的值
	birthday.display(birthday);
	//传递之后，在打印birthday对象的值
	System.out.println("传递之后：" +birthday.year + "-" + birthday.month + "-" + birthday.day);
}


	public static void main(String[] args) {
	testValue1();
	testValue2();
	}

}
