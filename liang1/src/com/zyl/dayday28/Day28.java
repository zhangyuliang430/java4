package com.zyl.dayday28;

import java.awt.image.SinglePixelPackedSampleModel;

public class Day28 {

	public static void main(String[] args) {
	Singleton pingshao1 = Singleton.getInstance();
	Singleton pingshao2 = Singleton.getInstance();
	Singleton pingshao3 = Singleton.getInstance();
	Singleton pingshao4 = Singleton.getInstance();
	
	System.out.println(pingshao1);
	System.out.println(pingshao2);
	System.out.println(pingshao3);
	System.out.println(pingshao4);

	}

}
