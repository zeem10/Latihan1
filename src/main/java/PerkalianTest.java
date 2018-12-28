import static org.junit.Assert.*;

import org.junit.Test;

public class PerkalianTest {
	
	@Test
	public void test1() {
		Perkalian kl = new Perkalian();
		assertEquals(kl.kali(1,5), 5);
	}
	
	@Test
	public void test2() {
		Perkalian kl = new Perkalian();
		assertEquals(kl.kali(0,5), 0);
	}
}
