﻿package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;
public class ex03_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
for(int i=0;i<n;i++){
	for(int j=0;j<=i;j++){
	System.out.print("*");
}
	
System.out.println();
	}
	}
	}

