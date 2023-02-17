package brocode.oop.accessmodifiers.package2;

import brocode.oop.accessmodifiers.package1.*;
public class Asub extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// C c = new C();
        // System.out.println(c.defaultMessage); 

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
	}

}
