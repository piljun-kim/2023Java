package ch7;

public class SportsCar extends Car{
	double turboFactor = 2;
	//double speed = 1;
	
	public SportsCar( ) {
		super(1, 2);
	}
	
	public void SetSpeed(double speed) {
		this.speed = speed * this.turboFactor;
	}
	
	void SetTurboFactor(double turboFactor) {
		this.turboFactor = turboFactor;
	}
}