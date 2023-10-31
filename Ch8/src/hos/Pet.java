package hos;

public class Pet {
	protected String owner;
	
	public Pet(String owner)
	{
		this.owner = owner;
	}
	
	public String OwnerName()
	{
		return owner;
	}
	
	public void Cry()
	{
		System.out.println("Mong Mong");
	}
	
}
