package classs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name :");
		String name = scanner.nextLine();
		System.out.print("What is your desinamtion :");
		String deg = scanner.nextLine();
		System.out.println("Your name is :- "+name+"  Your designation is :- "+deg);
	}

}
