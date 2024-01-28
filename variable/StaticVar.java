//Static variable in same class use by all access specifier
package variable;

public class StaticVar {
	
		public static int a=10;
		private static int b=20;
		protected static int c=30;
		 static int d=10;
		
	public static void main(String[] args) {
		System.out.println(a+b*c*d);

	}
}