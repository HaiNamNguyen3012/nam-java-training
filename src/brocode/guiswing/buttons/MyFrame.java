package brocode.guiswing.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("src\\brocode\\guiswing\\buttons\\point.png");
		ImageIcon icon2 = new ImageIcon("src\\brocode\\guiswing\\buttons\\wow.png");
		
		
		label = new JLabel();
		label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		label.setBounds(150, 250, 150, 150);
		label.setVisible(true);
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("I'm a button!");
		
		button.setFocusable(false);
		button.setIcon(new ImageIcon(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-5);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setVisible(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
//			System.out.println("poo");
//			button.setEnabled(false);
//			label.setVisible(true);
		}
	}
}
