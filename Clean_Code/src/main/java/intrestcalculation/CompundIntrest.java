package intrestcalculation;

public class CompundIntrest {
	public static double compoundIntrestCalculation(double principleAmount,double timeTaken,double ratePerYear, int compoundedAt) {
		double po=Math.pow(1+(ratePerYear/100), timeTaken);
	    return (principleAmount * po)-principleAmount;
	}
}
