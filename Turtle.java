

public class Turtle extends Reptilians
{
	
	private Owner _turtleOwner;
	public Turtle(String name, String color, double age, String ownerName, String ownerNumber)
	{
		super(name,color,age);
		this._turtleOwner = new Owner(ownerName,ownerNumber);
	}
	
	public String getOwnerName()
	{
		return _turtleOwner.getOwnerName();
	}
	
	public String getOwnerNumber()
	{
		return _turtleOwner.getOwnerNumber();
	}
	
	public void setOwnerNumber(String ownerNumber) {
		_turtleOwner.setOwnerNumber(ownerNumber);;
	}

	public void setOwnerName(String ownerName) {
		_turtleOwner.setOwnerName(ownerName); 
	}
	
	public String eat()
	{
		return "I eat plants.";
	}
	
	public String sleep()
	{
		return "I can sleep at night or day";
	}
	
	public String toString()
	{
		return super.toString()+ ". "+sleep()+" and "+eat()+"\nMy owner is: "+_turtleOwner.toString();
	}
	
	public String coldBlood()
	{
		return super.coldBlood();
	}
	
	public String propertyTu()
	{
		return"I have armor, I move very slowly.";
	}
	
	public boolean equals (Object ob) 
	{
		if ((ob != null) && (ob instanceof Turtle))
		{
			if (this.getName().equals(((Turtle)ob).getName()) &&
					this.getColor().equals(((Turtle)ob).getColor()) &&
					(this.getAge() == ((Turtle)ob).getAge()) &&
					this.propertyTu().equals(((Turtle)ob).propertyTu()) &&
					this.getOwnerName().equals(((Turtle)ob).getOwnerName()) &&
					this.getOwnerNumber().equals(((Turtle)ob).getOwnerNumber())
					
					)
					
				return true;
		}
		return false;
	}
	
	public Turtle clone()
	{
		Turtle t1=new Turtle(this.getName(),this.getColor(),this.getAge(), this.getOwnerName(),this.getOwnerNumber());
		return t1;
	}
}
