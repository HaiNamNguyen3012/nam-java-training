package brocode.guiswing.aboutgui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		this.setTitle("This is a Jthis title"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false); //prevent this from being resized
		this.setSize(420, 420); //set the x-dimension, y-dimension of this
		this.setVisible(true); //make this visible
		ImageIcon image = new ImageIcon("src\\brocode\\guiswing\\aboutgui\\329589972_496697295999587_2060739924983275244_n.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(123,50,250));
	}
}
