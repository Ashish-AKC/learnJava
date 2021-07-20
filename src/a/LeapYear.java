package a;
//A year is leap, if it is divisible by 4 and 400. But, not by 100.
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your year :- ");
		int year=s.nextInt();    
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
			System.out.println("This is a 'LEAP YEAR'");  
		}  
		else{  
			System.out.println("This is a 'COMMON YEAR'");  
		}  

	}

}
