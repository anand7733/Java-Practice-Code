//Reverse string and palindrom
package string;

public class Revrsepalidrom {

	public static void main(String[] args) {
		String s=("anand");
		
		String c=("101");
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev =rev+s.charAt(i);
			
		}
		System.out.println(rev);
	
		
		
		
		if(c.equals(rev))
		{
			System.out.println("Palindrom");
		}
		
		else
		{
			System.out.println("Not palindrom");
		}
	}

}
