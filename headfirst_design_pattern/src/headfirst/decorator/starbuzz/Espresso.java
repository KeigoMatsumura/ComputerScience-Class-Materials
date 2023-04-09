package headfirst.decorator.starbuzz;

/**
 * エスプレッソ
 */
public class Espresso extends Beverage {
  
	public Espresso() {
		description = "エスプレッソ";
	}
  
	public double cost() {
		return 1.99;
	}
}
