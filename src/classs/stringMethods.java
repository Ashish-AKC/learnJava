package classs;

public class stringMethods {

	public static void main(String[] args) {
		String fname = "Mark";
		String sname = " Joshep";

		String cat = fname+sname;
		System.out.println(cat);
		System.out.println(cat.toUpperCase());
		System.out.println(cat.toLowerCase());
		System.out.println(cat.charAt(3));
		System.out.println(cat.codePointAt(3));
		System.out.println(cat.codePointCount(3, 5));
		System.out.println(fname.hashCode());
		System.out.println("Both string compare with each other: "+fname.compareTo(fname));
		System.out.println(fname.compareTo(sname));
		System.out.println(fname.equals(fname));
		System.out.println(fname.equals(sname));
		System.out.println(sname.concat(fname));
		System.out.println(fname==sname);
		System.out.println();
		System.out.println(sname.contains("sname"));

	}

}
