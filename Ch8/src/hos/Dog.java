package hos;

public class Dog extends Pet{
	private double runSpeed;
	public Dog(String ownerName, double speed) 
	{
		super(ownerName);
		this.runSpeed = speed;
	}
	
	public double RunSpeed()
	{
		return runSpeed;
	}

}
