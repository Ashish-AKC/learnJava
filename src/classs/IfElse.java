package classs;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.print("Enter the total number : ");
		
			
		int str = scr.nextInt();

		if(str<35) {

			System.out.println("Your result is :- Fail");

		}else if(str>35&&str<=50) {

			System.out.println("Your result is :- Second");

		}else {

			if(str>=100) {

				System.out.println("Number is invalid! Please try again");
			}else {

				System.out.println("Your result is :- Pass");
			}


		}

	}

}
