

public class Bird extends Poultry
{
	public Bird(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String eat()
	{
		return "I eat plants";
	}
	
	public String sleep()
	{
		return "I sleep at night";
	}
	
	public String toString()
	{
		return super.toString()+ ".\n"+sleep()+" and "+eat()+".";
	}
	
	public String propertyBi()
	{
		return "I can fly.";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Bird))
		{
			if (this.getName().equals(((Bird)ob).getName()) &&
					this.getColor().equals(((Bird)ob).getColor()) &&
					(this.getAge() == ((Bird)ob).getAge()) &&
					this.propertyBi().equals(((Bird)ob).propertyBi()))
					
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		Object b1=new Bird(this.getName(),this.getColor(),this.getAge());
		return b1;
	}
}
