package constructionCostEstimationMain;

public class EstimatorMain {
	public static double estimateCost(String option,double totalArea, boolean automated) {
		double totalCost=0;
		if(option=="standard") {
			if(automated==true) {
				totalCost=StandardChoice.calculateCost(totalArea,300.0);
			}
			else
				totalCost=StandardChoice.calculateCost(totalArea);
		}
		else if(option=="abovestandard") {
			if(automated==true) {
				totalCost=AboveStandardChoice.calculateCost(totalArea,500.0);
			}
			else
				totalCost=AboveStandardChoice.calculateCost(totalArea);
		}
		else if(option=="highstandard") {
			if(automated==true) {
				totalCost=HighStandardChoice.calculateCost(totalArea,700.0);
			}
			else
				totalCost=HighStandardChoice.calculateCost(totalArea);
		}
		return totalCost;
	}
}
