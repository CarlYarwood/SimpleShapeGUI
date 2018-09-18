package BouncyShapeIcon;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class Triangle implements bouncyShape {

	private int height;
	private int width;
	private int x;
	private int y;
	private int xvel;
	private int yvel;
	private Color color;
	/**
	 * initiates a triangle with a random number generator passed as it's parameter
	 * @param ran
	 */
	public Triangle(Random ran){
		color = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
		height = 50;
		width = 50;
		x=1;
		y=1;
		xvel = ran.nextInt(5)+1;
		yvel = ran.nextInt(5)+1;
	}
	@Override
	public void paint(Graphics2D g2) {
		// TODO Auto-generated method stub
		g2.setColor(color);
		g2.draw(new Line2D.Double(x+(width/2),y,x,y+height));
		g2.draw(new Line2D.Double(x, y+height, x+width, y+height));
		g2.draw(new Line2D.Double(x+(width/2), y, x+width, y+height));
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		x+=xvel;
		y+=yvel;
	}

	@Override
	public void bounce(int width, int height) {
		// TODO Auto-generated method stub
		if(x+this.width+xvel >= width || x+xvel<= 0){
			xvel*=-1;
		}
		if(y+this.height+yvel>=height || y+yvel<=0){
			yvel*=-1;
		}
		
	}

}
