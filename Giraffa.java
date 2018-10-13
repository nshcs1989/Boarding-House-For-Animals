

public class Giraffa extends Mammals
{
	public Giraffa(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String eat()
	{
		return "I eat leafs of a tree.";
	}
	
	public String sleep()
	{
		return "I sleep at night";
	}
	
	public String toString()
	{
		return super.toString()+". "+sleep()+" and "+eat();
	}
	
	public String thyroidGland()
	{
		return super.thyroidGland();
	}
	
	public String propertyGi()
	{
		return "I have a long neck, long legs and a speckled color.";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Giraffa))
		{
			if (this.getName().equals(((Giraffa)ob).getName()) &&
					this.getColor().equals(((Giraffa)ob).getColor()) &&
					(this.getAge() == ((Giraffa)ob).getAge()) &&
					this.propertyGi().equals(((Giraffa)ob).propertyGi()))
					
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		Object g1=new Giraffa(this.getName(),this.getColor(),this.getAge());
		return g1;
	}
}
