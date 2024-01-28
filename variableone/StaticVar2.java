// static variable use different package

package variableone;// this package user defined 

import variable.StaticVar;// the import keyword used to import built-in and user-defined packages 

public class StaticVar2 {

	public static void main(String[] args) {
			       System.out.println(StaticVar.a);// pass
			       //System.out.println(StaticVar.b);//error the field staticvar.b & c & d not visible
				//System.out.println(StaticVar.a*StaticVar.b*StaticVar.c*StaticVar.d);
				//Variable b is private access specifier cannot use different package.
			       //Variable c is protected access specifier cannot use different package.
			       //Variable d is default access specifier cannot use different package.
			}
	}


