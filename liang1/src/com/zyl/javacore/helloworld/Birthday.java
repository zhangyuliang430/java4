package com.zyl.javacore.helloworld;

public class Birthday {
	private int day;
	private int month;
	private int year;
	/**
	 * ֵ���ݣ�����Ϊ��������
	 * @param year
	 * @param month
	 * @param day
	 */
public void display(int year,int month,int day){
	day = 11; month = 11; year = 2015;
	System.out.println("���ݷ����У�" + year + "-" + month +"-" + day);
}
/**
 * ���ô��ݣ����ݵ�����������
 * @param birthday
 */
public void display(Birthday birthday){
	birthday.year = 2012;
	birthday.month = 12;
	birthday.day = 12;
	System.out.println("���ݷ����У�" + birthday.year + "-" + birthday.month + "-" +birthday.day );
}
//ֵ���ݲ���
public static void testValue1(){
	Birthday birthday = new Birthday();
	//���������������͵ı������ֱ����գ��£���
	int day = 12, month = 12, year = 2016;
	//����֮ǰ��ӡ�������ĸ�������ֵ
	System.out.println("����֮ǰ��" + year + "-" + month + "-" + day);
	//���������������͵ı�����display�����У����ڷ����У��ı�������������ֵ
	birthday.display(year,month,day);
	//����֮���ڴ�ӡ������������ֵ
	System.out.println("����֮��" + year + "-" + month + "-" + day);
}
//���ô��ݲ���
public static void testValue2(){
	Birthday birthday = new Birthday();
	birthday.day = 3;
	birthday.month = 3;
	birthday.year = 2016;
	
	//����֮ǰ��ӡbirthday����ֵ
	System.out.println("����֮ǰ��" + birthday.year + "-" + birthday.month + "-" + birthday.day);
	//����birthday����display�����У����ڷ����У��ı�birthday�����ֵ
	birthday.display(birthday);
	//����֮���ڴ�ӡbirthday�����ֵ
	System.out.println("����֮��" +birthday.year + "-" + birthday.month + "-" + birthday.day);
}


	public static void main(String[] args) {
	testValue1();
	testValue2();
	}

}
