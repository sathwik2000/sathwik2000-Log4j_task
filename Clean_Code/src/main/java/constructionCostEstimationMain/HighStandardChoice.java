package constructionCostEstimationMain;

public class HighStandardChoice {
	public static double costPerSquare=1800;
	static double calculateCost(double Area,double extra) {
		costPerSquare+=extra;
		return (Area*costPerSquare);
	}
	static double calculateCost(double Area) {
		return (Area*costPerSquare);
	}
}
