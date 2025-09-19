package non_access_modifier;

import non_access_specifier.Access_Modifier;

public class Access_Specifier_1 extends Access_Modifier {

	public static void main(String[] args) {
		Access_Specifier_1 obj1 = new Access_Specifier_1();
		obj1.protmethod();
		obj1.pubmethod();
		Access_Modifier obj2 = new Access_Modifier();
		obj2.pubmethod();
		//obj2.privmethod();

	}

}
