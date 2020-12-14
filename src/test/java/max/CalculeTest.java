package max;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculeTest {
	
	private Calcule c;

	@BeforeAll
	public void Before() {
		// TODO Auto-generated method stub
		c = new Calcule(1,2);
	}
	
	@Test
	public void testAddition() {
		// TODO Auto-generated method stub
		Assertions.assertEquals(3, c.additionner());
	}

}
