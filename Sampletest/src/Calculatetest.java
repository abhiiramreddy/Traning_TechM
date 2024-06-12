import static org.junit.Assert.*;
import org.junit.Test;

public class Calculatetest {
	Calculate calculate = new Calculate();
	 int result = calculate.sum(2, 5);
	 int expected = 7;
	 
	 @Test
	 public void testsum() {
		 assertEquals(result, expected);
	 }
}
