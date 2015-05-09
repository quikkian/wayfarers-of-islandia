package org.quikkian.wayfarers.model.board;

import org.junit.Assert;

import org.junit.Test;

public class HexTest {

	/**
	 * Verifies that the {@link Hex#isDesert()} logic functions correctly.
	 */
	@Test
	public void isDesertLogic() {
		Hex notDesert = new Hex(HexType.CLAY);
		Hex desert = new Hex(HexType.DESERT);
		Assert.assertFalse(notDesert.isDesert());
		Assert.assertTrue(desert.isDesert());
	}

}
