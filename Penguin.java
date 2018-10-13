

public class Penguin extends Poultry
{
	public Penguin(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String eat()
	{
		return "I eat fish and crustaceans.";
	}
	
	public String sleep()
	{
		return "I sleep at night ";
	}
	
	public String toString()
	{
		return super.toString()+ ".\n"+sleep()+" and "+eat();
	}
	
	public String propertyPe()
	{
		return "I can't fly. I live only over southern hemisphere. ";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Penguin))
		{
			if (this.getName().equals(((Penguin)ob).getName()) &&
					this.getColor().equals(((Penguin)ob).getColor()) &&
					(this.getAge() == ((Penguin)ob).getAge()) &&
					this.propertyPe().equals(((Penguin)ob).propertyPe()))
					
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		Object pe1=new Penguin(this.getName(),this.getColor(),this.getAge());
		return pe1;
	}
}
