package org.quikkian.wayfarers.model.board;

/**
 * Represents a single hex tile on the game board.
 */
public class Hex {

	private final HexType type;

	/**
	 * Constructor.
	 * 
	 * @param type
	 *            Value for {@link #getType()}
	 */
	public Hex(HexType type) {
		this.type = type;
	}

	/**
	 * @return {@link HexType} describing what type of {@link Hex} this is.
	 */
	public HexType getType() {
		return type;
	}

	/**
	 * @return <code>true</code> if this {@link Hex} has a {@link HexType} of
	 *         {@link HexType#DESERT}, <code>false</code> otherwise.
	 */
	public boolean isDesert() {
		return type.equals(HexType.DESERT);
	}

}
