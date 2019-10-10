package com.basic;

import java.util.Scanner;

public class Function_Calculator {

	public static void main(String[] args) {
		int num1,num2,result,choice;
		num1=num2=result=choice=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter num1:");
		num1= sc.nextInt();
		
		System.out.println("\nEnter num2:");
		num2= sc.nextInt();
		
		System.out.println("press 1 to add the numbers\npress 2 to sub the numbers\npress 3 to multiply the numbers\npress 4 to divide the numbers");
         
	    Scanner no= new Scanner(System.in);
	    System.out.println("press no. from 1 to 4 based on your requirement");
	    choice= no.nextInt();
	    
	    
	    if(choice == 1) {
		result= add(num1,num2);
		System.out.println("Add--> num1: "+ num1 +" + num2: " + num2 + "=" +result);
	    }else
	    if(choice == 2) {	
		result= sub(num1,num2);
		System.out.println("Sub--> num1: "+ num1 +" - num2: " + num2 + "=" +result);
	    }else
	    if(choice == 3) {
		result= mul(num1,num2);
		System.out.println("Mul--> num1: "+ num1 +" * num2: " + num2 + "=" +result);
	    }else
	    if(choice == 4) {
		result= div(num1,num2);
		System.out.println("Div--> num1: "+ num1 +" / num2: " + num2 + "=" +result);
	    }	
	    sc.close();
	    no.close();
	}
 // main ends

static int add (int no1, int no2) {
	return no1+no2;
}

static int sub (int no1, int no2) {
	return no1-no2;

}
static int mul (int no1, int no2) {
	return no1*no2;
}

static int div (int no1, int no2) {
	return no1/no2;
}
}