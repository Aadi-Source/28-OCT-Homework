package Homework28OCT;

import java.util.Scanner;

public class program9 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int i,j,k;
		
		System.out.println("Enter The Number : ");
		i=sc.nextInt();
		
		if( i%3==0) {
			System.out.println("Mango");
		}else if(i%5==0) {
			System.out.println("Apple");
		}else if(i%3==0 && i%5==0) {
			System.out.println("Mango and Apple");
		}else {
			System.out.println(i);
		}
		
	
		
		

		
		}

	} 
	


