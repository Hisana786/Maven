package non_access_specifier;

public class Access_Modifier {
public void pubmethod()
{
	System.out.println("This is public");
}
private void privmethod()
{
	System.out.println("This is private");
}
void defmethod ()
{
	System.out.println("This is default");
}
protected void protmethod()
{
	System.out.println("This is protected");
}
	public static void main(String[] args) {
		 Access_Modifier obj = new  Access_Modifier();
		 obj.pubmethod();
		 obj.privmethod();
		 obj.protmethod();
		 obj.defmethod();

	}

}
