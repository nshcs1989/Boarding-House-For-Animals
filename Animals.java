

public abstract class Animals 
{
	private String _name;
	private String _color;
	private double _age;
	
	public Animals(String name, String color, double age)
	{
		setName(name);
		setColor(color);
		setAge(age);
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		if (name != null)
			this._name = name;
		else
			this._name = "";
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		if (color != null)
			this._color = color;
		else
			this._color ="";
	}

	public double getAge() {
		return _age;
	}

	public void setAge(double age) {
		if(age>0)
		{
			this._age = age;
		}
		else
		{
			this._age = 0;
		}
		
	}
	
	public String eat()
	{
		return "";
	}
	
	public String sleep()
	{
		return "";
	}
	
	public String toString()
	{
		return"";
	}
	
}
