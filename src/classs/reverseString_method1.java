package classs;

import java.util.Scanner;

public class reverseString_method1 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String name = scr.nextLine();
		
		
		String rev = "";
		
		//Method 1 
		int len = name.length();
		
		for (int i=len-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		
		System.out.println("Orignal string is :-"+name);
		System.out.println("Reverse string is :-"+rev);
		
		//Method 2
		
		char a[] = name.toCharArray();
		int lenth = a.length;
		
		for(int i=lenth-1;i>=0;i--) {
			
			rev=rev+a[i];
			
		}
		System.out.println("Reverse string is(Array) :-"+rev);
		
		
		
		
		
		//Method 3
		StringBuffer ste = new StringBuffer(name);
		System.out.println("Rerver string is "+ste.reverse());

	}

}
