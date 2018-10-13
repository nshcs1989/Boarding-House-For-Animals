

public class Snake extends Reptilians
{
	public Snake(String name, String color, double age)
	{
		super(name,color,age);
	}
	
	public String eat()
	{
		return "I eat animals.";
	}
	
	public String sleep()
	{
		return "I can sleep at night or day ";
	}
	
	public String toString()
	{
		return super.toString()+ ". "+sleep()+" and "+eat();
	}
	
	public String coldBlood()
	{
		return super.coldBlood();
	}
	
	public String propertySn()
	{
		return"I have dandruff, I can be poisonous and dangerous to a person.";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Snake))
		{
			if (this.getName().equals(((Snake)ob).getName()) &&
					this.getColor().equals(((Snake)ob).getColor()) &&
					(this.getAge() == ((Snake)ob).getAge()) &&
					this.propertySn().equals(((Snake)ob).propertySn()))
					
				return true;
		}
		return false;
	}
	
	public Object clone()
	{
		Object t1=new Snake(this.getName(),this.getColor(),this.getAge());
		return t1;
	}
}
