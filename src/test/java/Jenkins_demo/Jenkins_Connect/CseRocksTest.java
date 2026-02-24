package Jenkins_demo.Jenkins_Connect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CseRocksTest {

	CseRocks cse = new CseRocks();
	@Test
	void testAdd() {
		assertEquals(10, cse.add(5, 5));
	}
	@Test
	void testSub() {
		assertEquals(0, cse.sub(5, 5));
	}
}
