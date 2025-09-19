package non_access_specifier;

public class Access_Specifier extends Access_Modifier{

	public static void main(String[] args) {
		Access_Specifier object = new Access_Specifier();
		object.pubmethod();
		object.protmethod();
		object.defmethod();
		//object.privmethod();only access inside the class not outside the class

	}

}
