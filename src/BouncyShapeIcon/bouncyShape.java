package BouncyShapeIcon;

import java.awt.Graphics2D;

public interface bouncyShape {
	/**
	 * paints the shape
	 * @param g2
	 */
	public void paint(Graphics2D g2);
	/**
	 * moves the shape
	 */
	public void move();
	/**
	 * detects whether the shape is about to leave the alloted area, and if so, bounces
	 * the shape
	 * @param width
	 * @param height
	 */
	public void bounce(int width, int height);
}
