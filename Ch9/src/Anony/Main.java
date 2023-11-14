package Anony;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.TestMethod(new Parent() {
			void method() {
				System.out.println("I am a Child");
			}
		});
	}
	
	void TestMethod(Parent p) {
		p.method();
	}
}

