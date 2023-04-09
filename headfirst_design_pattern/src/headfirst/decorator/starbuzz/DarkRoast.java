package headfirst.decorator.starbuzz;

/**
 * ダークローストコーヒー
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "ダークロースト";
	}

	public double cost() {
		return .99;
	}
}

