package sorting.project.model;

public class Keyboards implements Comparable
{
	private String name;
	private String typeOfKeys;
	private double price;
	
	public String toString()
	{
		String keyboardString = "";
		
		keyboardString += "Hi, I am a keyboard. More specifically, I am a " + name + ".";
		keyboardString += " I have " + typeOfKeys + " and ";
		keyboardString += "I cost $" + price + ".";
		
		return keyboardString;
	}
	/**
	 * comparing the price of the keyboards if it's less than it give a -1 if greater than it gives a 1 if equal to it is 0
	 */
	 
	public int compareTo(Object otherKeyboard)
	{
		int comparedValue = 0;
		
		if(otherKeyboard instanceof Keyboards)
		
		if(this.price <((Keyboards) otherKeyboard).price )
		{
			comparedValue = -1;
			
		}
		else if(this.price >((Keyboards) otherKeyboard).price )
		{
			comparedValue = 1;
			
		}
		return comparedValue;
	}
	
	private String getName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Keyboards(String name, String typeOfKeys, double price)
	{
		this.name = name;
		this.typeOfKeys = typeOfKeys;
		this.price = price;
	}
}
