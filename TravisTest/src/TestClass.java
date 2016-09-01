import static org.junit.Assert.*;

import javax.swing.SpringLayout.Constraints;

import org.junit.Test;

public class TestClass {
	

	@Test
	public void test() {
		Hello junit=new Hello();
		int result=junit.add(5, 5);
		assertEquals(10, result);
		}

}
