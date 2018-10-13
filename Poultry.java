

public abstract class Poultry extends Animals 
{
	public Poultry(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String toString()
	{
		return"I'm a Poultry, my name is "+super.getName()+", my color is "+super.getColor()+", my age (in mounts) is "+super.getAge()
				;
	}
	
	
}
