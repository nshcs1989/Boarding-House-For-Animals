

public class Elephant extends Mammals 
{
	public Elephant(String name, String color, double age)
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
	
	public String propertyEl()
	{
		return "I have snout.";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Elephant))
		{
			if (this.getName().equals(((Elephant)ob).getName()) &&
					this.getColor().equals(((Elephant)ob).getColor()) &&
					(this.getAge() == ((Elephant)ob).getAge()) &&
					this.propertyEl().equals(((Elephant)ob).propertyEl()))
					
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		Object e1=new Elephant(this.getName(),this.getColor(),this.getAge());
		return e1;
	}
}
