package classs;
//method with parameters
public class methods {
	
	static int math(int a, int b) {
		
		return(a+b);
	}
//method without parameters
	
	static void printName() {
		
		System.out.println("This is my first method");
		
	}
	public static void main(String[] args) {
		
		printName();
		int total = math(10, 20);
		System.out.println("Total number is :-" +total);

	}

}
