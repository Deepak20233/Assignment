package com.java;
import java.util.*;
public class PercentageOfHeadsAndTails {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number of times to flip the coin");
    int flipcoin= sc.nextInt();
    double result= Math.random()*2;
    if(result<0.5)
    	System.out.println("Tails");
    else
    	System.out.println("Heads");
	}
}
