package constructionCostEstimationTest;

import org.junit.Assert;
import org.junit.Test;
import constructionCostEstimationMain.*;
public class AboveStandardChoiceTest {

	@Test
	public void test() {
		Assert.assertEquals(20000.0,EstimatorMain.estimateCost("abovestandard",10.0,true),0);

		}

}
