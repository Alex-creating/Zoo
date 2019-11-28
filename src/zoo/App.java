package zoo;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String [] Args) {
		Dog animal1 = new Dog();
		animal1.move();
		animal1.fetch();
		Animal animal2 = new Tiger();
		animal2.move();
		
		
		List<Animal> zoo = new ArrayList<>();
		zoo.add(animal1);
		zoo.add(animal2);
		for (Animal a : zoo) {
			a.move();
		
		}
		
		
	}
	
}


