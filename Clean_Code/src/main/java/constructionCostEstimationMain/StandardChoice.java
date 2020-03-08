package constructionCostEstimationMain;

public class StandardChoice {
	public static double costPerSquare=1200;
	static double calculateCost(double Area,double extra) {
		costPerSquare+=extra;
		return (Area*costPerSquare);
	}
	static double calculateCost(double Area) {
		return (Area*costPerSquare);
	}
}
