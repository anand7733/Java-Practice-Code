//Static variable in different class  
// package name should be same for last class staticVar other wise error show
package variable;// this package user define

public class SaticVar1 {

	public static void main(String[] args) {
		System.out.println(StaticVar.a*StaticVar.c*StaticVar.d);
		
		//System.out.println(StaticVar.b);//error the field StaicVar.b is not visible because its private access spicifer
		//System.out.println(StaticVar.a*StaticVar.b*StaticVar.c*StaticVar.d); 
		//a variable is public access specifier public can access every class package 
		// b variable is private access specifier
		// c variable is protected access specifier is access the different class 
		// d variable is default access specifier is access the different class
	}

}
