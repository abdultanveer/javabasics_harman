package basics;

import java.util.Scanner;

public class Methods {
	
	public static void main(String[] args) {
		//creating Scanner class object     
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reading value from the user  
		int num = scan.nextInt();  
		//method calling  
		findEvenOdd(num);
	}

	public static void findEvenOdd(int num)  
	{  
		//method body  -- indented - ctrl+I
		if(num%2==0)   
			System.out.println(num+" is even");   
		else   
			System.out.println(num+" is odd");  
	}  
}
