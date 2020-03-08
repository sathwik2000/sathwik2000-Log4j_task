package constructionCostEstimationMain;

public class AboveStandardChoice {
	public static double costPerSquare=1500;
	static double calculateCost(double Area,double extra) {
		costPerSquare+=extra;
		return (Area*costPerSquare);
	}
	static double calculateCost(double Area) {
		return (Area*costPerSquare);
	}
}
