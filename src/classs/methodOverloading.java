package classs;

public class methodOverloading {

	static int plucMethod(int i,int j) {
		
		System.out.println("int values printed");
		return(i+j);
		

	}

	static double plucMethod(double i,double j) {
		
		System.out.println("Double values printed");
		return(i+j);

	}
	
	 static String name(String name) {
		
		System.out.println("Method has string values");
		return name;
		
	}
	
	static int age(int num) {
		
		System.out.println("Method has integer values");
		return num;
	}

	public static void main(String[] args) {
		int plusInt = plucMethod(10, 20);
		double plusdouble = plucMethod(10.5, 12.5);
		  System.out.println("int: " + plusInt);
		  System.out.println("double: " + plusdouble);
		  
		 String n = name("Ashish");
		 int a = age(30);
		  
		 System.out.println("My name is "+n+ " age is "+a);
		 System.out.println("Lenth of the string "+n.length());
	}

}
