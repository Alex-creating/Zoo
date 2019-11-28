package zoo;

public class Dog extends Mammal {

	public Dog() {
		super(4, 2, "Doggo");
		this.setNoOfLegs(4);
		this.setNoOfEyes(2);
		this.setSciName("Doggo");
	}
	
	public void move() {
		System.out.println("Walkies");
	}
	public void fetch() {
		System.out.println("Fetched!");
	}
}
