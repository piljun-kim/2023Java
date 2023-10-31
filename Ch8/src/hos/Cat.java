package hos;

public class Cat extends Pet {
	private double jumpingHeight;
	
	public Cat(String ownerName, double height)
	{
		super(ownerName);
		this.jumpingHeight = height;
	}

	public double JumpingHeight() 
	{
		return jumpingHeight;
	}
}
