package headfirst.strategy;

/**
 * ガーガー鳴く
 */
public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("ガーガー");
	}
}
