package com.java;
import java.util.*;
public class QuotientAndRemainder {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	double quotient=num1%num2;
	double remainder=num1/num2;
	System.out.println("Quotient is:"+quotient);
	System.out.println("Remainder is:"+remainder);

	}

}
