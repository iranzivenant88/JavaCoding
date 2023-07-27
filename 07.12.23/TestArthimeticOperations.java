import org.junit.Assert;
import org.junit.Test;
public class TestArthimeticOperations{
	@Test
	public void testAddition(){
		int resultAdd = ArthimeticOperations.add(3,4);
		Assert.assertEquals(resultAdd,7);
	}
	@Test
	public void testDivide(){
		int resultDivide = ArthimeticOperations.divide(5,2);
		Assert.assertEquals(resultDivide,2);
	}



}