package brocode.oop.accessmodifiers.package1;

import brocode.oop.accessmodifiers.package2.*;

public class A {
	protected String protectedMessage = "This is protected message in A class";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 C c = new C();
         System.out.println(c.publicMessage); 
	}

}
