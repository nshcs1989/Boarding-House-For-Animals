

public class Owner 
{
	private String _ownerNumber;
	private String _ownerName;
	
	public Owner()
	{
		_ownerNumber="";
		_ownerName="";
	}
	
	public Owner(String ownerName, String ownerNumber  )
	{
		setOwnerNumber(ownerNumber);
		setOwnerName(ownerName);
		
	}

	public String getOwnerNumber() {
		return _ownerNumber;
	}

	public void setOwnerNumber(String ownerNumber) {
		if (ownerNumber !=null)
			this._ownerNumber =ownerNumber;
		else
			ownerNumber="";
	}

	public String getOwnerName() {
		return _ownerName;
	}

	public void setOwnerName(String ownerName) {
		if (ownerName != null)
			this._ownerName = ownerName;
		else
			this._ownerName ="";
	}
	
	public String toString()
	{
		if (getOwnerName() !="" && getOwnerNumber() != "")
			return getOwnerName()+", Cell phone number is: "+getOwnerNumber();
		else
			return "There is no owner to this animal.";
	}
	
}
