package classs;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str = scr.nextLine();
		System.out.print("Reverse of a String '"+str+"' is :");
		
		int i = str.length();
		while(i>0) {
			System.out.print(str.charAt(i-1));
			i--;
		}
		
		

	}

}
