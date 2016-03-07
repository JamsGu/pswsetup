package com.gu;

import java.util.Random;
import java.util.Scanner;

public class PswSetUp {
	private static String pswPool1 = "abcdefghijklmnopqrstuvwxyz";
	private static String pswPool2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String pswPool3 = "0123456789";
	private static String pswPool4 = "~!@#$%^&*,.;':";
	private static String pswPool = pswPool1 + pswPool2 + pswPool3 +pswPool4;
	private static String randomPsw(int length){
		Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<length;i++){
	    	 int number = random.nextInt(pswPool.length());
	       sb.append(pswPool.charAt(number));
	     }
	     return sb.toString();
		}
	public static void main(String[] args){
		PswSetUp psu = new PswSetUp();
		System.out.print("请输入要生成的密码长度：");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.println(randomPsw(in));
	}
}

