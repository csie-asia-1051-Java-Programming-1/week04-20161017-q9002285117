﻿package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;
public class ex01_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int sum=0;
int a=0;
while(n!=-1){
	
	sum=sum+n;
	n=scn.nextInt();
	a+=1;
}
System.out.println(sum);
System.out.println(sum/a);
	}
}
