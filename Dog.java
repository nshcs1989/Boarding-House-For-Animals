

public class Dog extends Mammals implements Cloneable
{
	private Owner _dogOwner;
	public Dog(String name, String color, double age, String ownerName, String ownerNumber )
	{
		super(name,color,age);
		this._dogOwner = new Owner(ownerName,ownerNumber);
	}
	
	public String eat()
	{
		return "I eat dog's food";
	}
	
	public String sleep()
	{
		return "I sleep at night";
	}
	
	public String toString()
	{
		return super.toString()+". "+sleep()+" and "+eat()+".\nMy owner is: "+_dogOwner.toString();
	}
	
	public String thyroidGland()
	{
		return super.thyroidGland();
	}
	
	public String propertyDog()
	{
		return "I'm human best friend.";
	}
	
	public String getOwnerName()
	{
		return _dogOwner.getOwnerName();
	}
	
	public String getOwnerNumber()
	{
		return _dogOwner.getOwnerNumber();
	}
	
	public void setOwnerNumber(String ownerNumber) {
		_dogOwner.setOwnerNumber(ownerNumber);
	}

	public void setOwnerName(String ownerName) {
		_dogOwner.setOwnerName(ownerName); 
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Dog))
		{
			if (this.getName().equals(((Dog)ob).getName()) &&
					this.getColor().equals(((Dog)ob).getColor()) &&
					(this.getAge() == ((Dog)ob).getAge()) &&
					this.propertyDog().equals(((Dog)ob).propertyDog()) &&
					this.getOwnerName().equals(((Dog)ob).getOwnerName()) &&
					this.getOwnerNumber().equals(((Dog)ob).getOwnerNumber())
					)
					
				return true;
		}
		return false;
	}
	
	public Dog clone()
	{
		Dog d1=new Dog(this.getName(),this.getColor(),this.getAge(),this.getOwnerName(),this.getOwnerNumber());
		return d1;
	}
}
