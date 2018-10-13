import java.util.ArrayList;

public class AnimalShelter 
{
	public static void main(String[] args)
	{
		ArrayList<Animals> animal = new ArrayList<>();
		animal.add(new Dog("Dog","Brown",2.5,"Dani","0501111111"));
		animal.add(new Elephant("Elephant","Gray",8.0));
		animal.add(new Giraffa("Giraffa","Yello",3.2));
		animal.add(new Turtle("Turtle","Green",2.5,"Tami","0521111111"));
		animal.add(new Snake("Snake","Gray",1.5));
		animal.add(new Alligator("Alligator","Gray",2.0));
		animal.add(new Bird("Bird","Blue",0.8));
		animal.add(new Chicken("Chicken","White",1.3));
		animal.add(new Penguin("Penguin","Black",1.7));
		
		for(int i=0;i<animal.size();i++)
		{
			System.out.println(animal.get(i));
			if (animal.get(i) instanceof Dog)
			{
				System.out.println(((Dog)animal.get(i)).propertyDog());
			}
			if (animal.get(i) instanceof Elephant)
			{
				System.out.println(((Elephant)animal.get(i)).propertyEl());
			}
			if (animal.get(i) instanceof Giraffa)
			{
				System.out.println(((Giraffa)animal.get(i)).propertyGi());
			}
			if (animal.get(i) instanceof Snake)
			{
				System.out.println(((Snake)animal.get(i)).propertySn());
			}
			if (animal.get(i) instanceof Turtle)
			{
				System.out.println(((Turtle)animal.get(i)).propertyTu());
			}
			if (animal.get(i) instanceof Alligator)
			{
				System.out.println(((Alligator)animal.get(i)).propertyAl());
			}
			if (animal.get(i) instanceof Bird)
			{
				System.out.println(((Bird)animal.get(i)).propertyBi());
			}
			
			if (animal.get(i) instanceof Chicken)
			{
				System.out.println(((Chicken)animal.get(i)).propertyCh());
			}
			if (animal.get(i) instanceof Penguin)
			{
				System.out.println(((Penguin)animal.get(i)).propertyPe());
			}
			
			System.out.println("\n");
		}
		
		System.out.println("Now we will take an animal, replicate it and change the details of the animals that were duplicated.\nWe will present the data");
		
		Dog d=new Dog("DOG","Black",2.3, "Jo","0510000000");
		Dog d1=d.clone();
		
		System.out.println("\nBefore the change:\nSource object:\n");
		System.out.println(d);
		System.out.println(d.propertyDog());
		System.out.println("\nCopy object:\n");
		System.out.println(d1);
		System.out.println(d1.propertyDog());
		System.out.println("This the result of the methode equals: "+d.equals(d1));
		System.out.println("\n");
		System.out.println("After the change:\nSource object:\n");
		d1.setOwnerName("Or");
		d1.setOwnerNumber("07311123456");
		System.out.println(d);
		System.out.println(d.propertyDog());
		System.out.println("\nCopy object:\n");
		System.out.println(d1);
		System.out.println(d1.propertyDog());
		System.out.println("This the result of the methode equals: "+d.equals(d1));
		
	}
	
	
}
