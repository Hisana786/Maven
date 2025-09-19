package interfaces;

public interface Interface_Parent {
public static final int a =5;
public static final int b =6;
public abstract void sum();
default void diff()
{
	int a =23;
	int b =15;
	int c =a-b;
	System.out.println(c);
}
public static void show()
{
	System.out.println("This is static method");
}
}
