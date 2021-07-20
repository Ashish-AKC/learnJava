package a;

public class TypeCasting {

	public static void main(String[] args) {
		
		int i =10;
		short a=20;
		short b=30;
		System.out.println(i);
		String s=String.valueOf(i);
		System.out.println(i);
		a=(short) (a+b);//type cast for int to short
		System.out.println(a);
	}

}
