package org.quikkian.wayfarers.model.board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a board comprised of 19 {@link Hex} tiles.
 */
public class Board {

	private final List<Hex> hexes;

	/**
	 * Constructor.
	 * 
	 * @param hexes
	 *            Value for {@link #getHexes()}
	 * @throws UnsupportedOperationException
	 */
	public Board(List<Hex> hexes) {
		if (hexes.size() != 19) {
			throw new UnsupportedOperationException(
					"Boards of a size other than 19 are not supported.");
		}
		//TODO add logic to ensure there are the correct number of tiles of each type
		this.hexes = new ArrayList<Hex>();
		this.hexes.addAll(hexes);
	}

	/**
	 * @return <p>
	 *         Unmodifiable {@link List} of 19 {@link Hex} tiles representing
	 *         the playing board. Indexing is a spiral beginning at the top of
	 *         the board (12 o'clock), going clockwise, and entering into the
	 *         inner tier when reaching 12 o'clock again.
	 *         </p>
	 *         <p>
	 *         Example (0-based indexing):
	 *         <ul>
	 *         <li>{@literal --  --  --  --  00  --  --  --  -- }</li>
	 *         <li>{@literal --  --  --  11  12  01  --  --  -- }</li>
	 *         <li>{@literal --  --  10  17  --  13  02  --  -- }</li>
	 *         <li>{@literal --  --  09  --  18  --  03  --  -- }</li>
	 *         <li>{@literal --  --  08  16  --  14  04  --  -- }</li>
	 *         <li>{@literal --  --  --  07  15  05  --  --  -- }</li>
	 *         <li>{@literal --  --  --  --  06  --  --  --  -- }</li>
	 *         </ul>
	 * 
	 *         </>
	 * 
	 */
	public List<Hex> getHexes() {
		return Collections.unmodifiableList(hexes);
	}
}
