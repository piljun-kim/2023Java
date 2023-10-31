package hos;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
		Pet p1 = new Dog("KPJ", 25);
		Pet p2 = new Cat("KPJ", 3);
		
		m.ShowOwner(p1);
		m.ShowOwner(p2);
		
//		m.TestCry(p1);
//		m.TestCry(p2);
	}
	void ShowOwner(Pet p) {
		System.out.println("Owner's name is " + p.OwnerName());
	}
	
	void TestCry(Pet p) {
		p.Cry();
	}
	
}
