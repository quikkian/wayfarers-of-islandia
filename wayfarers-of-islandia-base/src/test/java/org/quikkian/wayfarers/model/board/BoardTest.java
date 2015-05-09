package org.quikkian.wayfarers.model.board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

	private final List<Hex> sampleBoard = buildSampleBoard();

	/**
	 * Verifies that constructing a {@link Board} correctly throws an
	 * {@link UnsupportedOperationException} when the {@link List} of
	 * {@link Hex}es it is provided is a size other than 19.
	 */
	@Test
	public void boardSize() {
		boolean exceptionThrown = false;
		try {
			new Board(sampleBoard);
		} catch (UnsupportedOperationException e) {
			exceptionThrown = true;
		}
		Assert.assertFalse(exceptionThrown);

		List<Hex> tooBig = new ArrayList<Hex>();
		tooBig.addAll(sampleBoard);
		tooBig.add(new Hex(HexType.CLAY));

		exceptionThrown = false;
		try {
			new Board(tooBig);
		} catch (UnsupportedOperationException e) {
			exceptionThrown = true;
		}
		Assert.assertTrue(exceptionThrown);

		List<Hex> tooSmall = new ArrayList<Hex>();
		tooSmall.addAll(sampleBoard);
		tooSmall.remove(0);

		exceptionThrown = false;
		try {
			new Board(tooSmall);
		} catch (UnsupportedOperationException e) {
			exceptionThrown = true;
		}
		Assert.assertTrue(exceptionThrown);
	}

	/**
	 * @return {@link List} of 19 {@link Hex} tiles with the correct resource
	 *         distribution.
	 */
	private List<Hex> buildSampleBoard() {
		List<Hex> hexes = new ArrayList<Hex>();
		// 1 desert
		hexes.add(new Hex(HexType.DESERT));
		// 4 grain
		hexes.add(new Hex(HexType.GRAIN));
		hexes.add(new Hex(HexType.GRAIN));
		hexes.add(new Hex(HexType.GRAIN));
		hexes.add(new Hex(HexType.GRAIN));
		// 4 wool
		hexes.add(new Hex(HexType.WOOL));
		hexes.add(new Hex(HexType.WOOL));
		hexes.add(new Hex(HexType.WOOL));
		hexes.add(new Hex(HexType.WOOL));
		// 4 lumber
		hexes.add(new Hex(HexType.LUMBER));
		hexes.add(new Hex(HexType.LUMBER));
		hexes.add(new Hex(HexType.LUMBER));
		hexes.add(new Hex(HexType.LUMBER));
		// 3 clay
		hexes.add(new Hex(HexType.CLAY));
		hexes.add(new Hex(HexType.CLAY));
		hexes.add(new Hex(HexType.CLAY));
		// 3 stone
		hexes.add(new Hex(HexType.STONE));
		hexes.add(new Hex(HexType.STONE));
		hexes.add(new Hex(HexType.STONE));
		return Collections.unmodifiableList(hexes);
	}

}
