package com.zyl.dayday28;
// 单 例 模 式 中 的 懒 汉 模 式
public class Singleton {
	private  static Singleton liangshao = null;//懒汉模式   单例模式
	//给当前类创建一个对象或实例
   
	private  Singleton(){
		//私有化 构造方法
		System.out.println("程序正在被执行。。。。");
	}
	public static Singleton getInstance(){
		//为 外  部 提 供 可 以 得 到 的 实 例 方 法
		if(liangshao == null){
			liangshao = new Singleton();
			//私 有 化   只 有 自 己能 NEW  别的无法NEW
		}
		return liangshao;
	}
	
}
