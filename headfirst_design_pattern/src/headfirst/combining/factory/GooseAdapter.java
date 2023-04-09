package headfirst.combining.factory;

public class GooseAdapter implements Quackable {
	private Goose goose;
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
  
	public void quack() {
		goose.honk();
	}
 
	public String toString() {
		return "鴨のふりをしたガチョウ";
	}
}