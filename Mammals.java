

public abstract class Mammals extends Animals
{
	public Mammals(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	
	public String toString()
	{
		return"I'm a mammal, my name is "+super.getName()+", my color is "+super.getColor()+", my age (in years) is "+super.getAge()+
				".\nBecause I'm a mammal " +thyroidGland();
	}
	
	public String thyroidGland()
	{
		return "I have Thyroid gland";
	}
	
	
}
