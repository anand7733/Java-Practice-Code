package string;

public class Equalsmethod {

	public static void main(String[] args) {
		 
		String s1="Anand";
		String s2="Singh";
		String s3="singh";
		String s4="AnAnd";
		//equals method use compare the two strings
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s2));
		System.out.println(s4.equals(s3));
		System.out.println(s4.equals(s1));
		System.out.println(s4.equals(s2));
		
		//equalsIgnoreCase method use compare a specific string ignore case lowercase or uppercase.
		
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
