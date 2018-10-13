

public class Chicken extends Poultry 
{
	public Chicken(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String eat()
	{
		return "I eat small amount of meat and fish, but mainly plants.";
	}
	
	public String sleep()
	{
		return "I sleep at night";
	}
	
	public String toString()
	{
		return super.toString()+ ".\n"+sleep()+" and "+eat();
	}
	
	public String propertyCh()
	{
		return "I can fly but I don't know how to do so. ";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Chicken))
		{
			if (this.getName().equals(((Chicken)ob).getName()) &&
					this.getColor().equals(((Chicken)ob).getColor()) &&
					(this.getAge() == ((Chicken)ob).getAge()) &&
					this.propertyCh().equals(((Chicken)ob).propertyCh()))
					
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		Object ch1=new Chicken(this.getName(),this.getColor(),this.getAge());
		return ch1;
	}
}
