package headfirst.combining.factory;

public class RubberDuck implements Quackable {
 
	public void quack() {
		System.out.println("キューキュー");
	}
  
	public String toString() {
		return "ゴムのアヒル";
	}
}
