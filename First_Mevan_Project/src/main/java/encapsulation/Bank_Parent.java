package encapsulation;

public class Bank_Parent {
private int pin;
public void setPin(int pin)
{
	this.pin=pin;
}
public boolean getPin()
{
	if(pin==1001||pin==1234||pin==1212)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
