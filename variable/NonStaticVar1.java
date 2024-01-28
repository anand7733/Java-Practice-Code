//Non Static Variable in different Class

package variable;

public class NonStaticVar1 {

	public static void main(String[] args) {
		NonnStaticVar ob =new NonnStaticVar();
		//System.out.println(ob.a*ob.b);// b variable is private access specifier so cannot access
		System.out.println(ob.a*ob.c*ob.d);//32000
	}

}
