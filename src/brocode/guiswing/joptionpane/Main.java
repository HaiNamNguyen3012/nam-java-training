package brocode.guiswing.joptionpane;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane = pop up a stadard dialog box that prompts user
		// for value or informs them of something
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "You're computer has a VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE", "title", JOptionPane.ERROR_MESSAGE);

//		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("What is your name?: ");
		
		String respones[] = {"No, you're awesome!", "Thank you!", "*blush*"};
		
		ImageIcon icon = new ImageIcon(new ImageIcon("src\\brocode\\guiswing\\joptionpane\\images.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		JOptionPane.showOptionDialog(
				null,
				"You are awesome!",
				"Secret message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				respones,
				0);
	}

}
