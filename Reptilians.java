

public abstract class Reptilians extends Animals 
{
	public Reptilians(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String toString()
	{
		return"I'm a Reptilians, my name is "+super.getName()+", my color is "+super.getColor()+", my age (in mounts) is "+super.getAge()+
				".\n" +coldBlood();
	}
	
	public String coldBlood()
	{
		return "I'm hetrothermic reptilian";
	}
	
	
}
