package BouncyShapeIcon;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
/**
 * 
 * @author cdy8858
 *
 */
public class BouncyShapeIcon implements Icon {
	private ArrayList<bouncyShape> shapes;
	private int width;
	private int height;
	private Random ran;
	/**
	 * initiates an instance of the bouncy shpae Icon
	 */
	public BouncyShapeIcon(){
		width = 500;
		height = 500;
		ran = new Random();
		shapes = new ArrayList<bouncyShape>();
	}
	/**
	 * adds a square to the list of shpes
	 */
	public void addSquare(){
		shapes.add(new Square(ran));
	}
	/**
	 * adds a circle to the list of shapes
	 * 
	 */
	public void addCircle(){
		shapes.add(new Circle(ran));
	}
	/**
	 * adds a triangel to the list of shapes
	 */
	public void addTriangle(){
		shapes.add(new Triangle(ran));
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) arg1;
		for(int i = 0; i< shapes.size(); i++){
			shapes.get(i).bounce(width, height);
			shapes.get(i).move();
			shapes.get(i).paint(g2);
		}
	}

}
