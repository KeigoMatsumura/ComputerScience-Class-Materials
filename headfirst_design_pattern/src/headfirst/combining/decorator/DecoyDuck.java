package headfirst.combining.decorator;

public class DecoyDuck implements Quackable {
 
	public void quack() {
		System.out.println("<<沈黙>>");
	}
 
	public String toString() {
		return "おとりの鴨";
	}
}
