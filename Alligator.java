

public class Alligator extends Reptilians 
{
	public Alligator(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String eat()
	{
		return "I eat meat.";
	}
	
	public String sleep()
	{
		return "I can sleep at night or day";
	}
	
	public String toString()
	{
		return super.toString()+ ". "+sleep()+" and "+eat();
	}
	
	public String coldBlood()
	{
		return super.coldBlood();
	}
	
	public String propertyAl()
	{
		return"I am aggressive, predatory and can live on land and at sea.";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Alligator))
		{
			if (this.getName().equals(((Alligator)ob).getName()) &&
					this.getColor().equals(((Alligator)ob).getColor()) &&
					(this.getAge() == ((Alligator)ob).getAge()) &&
					this.propertyAl().equals(((Alligator)ob).propertyAl()))
					
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		Object a1=new Alligator(this.getName(),this.getColor(),this.getAge());
		return a1;
	}
}
