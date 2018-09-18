import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import BouncyShapeIcon.BouncyShapeIcon;

public class YarwoodCarlBouncyShapesGUI {

	public static void main(String[] args){
		int delay = 42;
		JFrame frame = new JFrame();
		BouncyShapeIcon icon = new BouncyShapeIcon();
		Button square = new Button("add Square");
		Button circle = new Button("add Circle");
		Button triangle = new Button("add Triangle");
		JLabel iconic = new JLabel(icon);
		Timer t = new Timer(delay, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				iconic.repaint();
			}
			
		});
		square.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				icon.addSquare();
			}
			
		});
		circle.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icon.addCircle();
			}
			
		});
		triangle.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icon.addTriangle();
				
			}
			
		});
		frame.add(circle);
		frame.add(square);
		frame.add(triangle);
		frame.add(iconic);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		t.start();
		frame.setVisible(true);
	}
}
