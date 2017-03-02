
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Matching implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton card1 = new JButton();
	JButton card2 = new JButton();
	JButton card3 = new JButton();
	JButton card4 = new JButton();
	JLabel counter = new JLabel();
	JLabel word1 = new JLabel();
	JLabel word2 = new JLabel();
	JLabel word3 = new JLabel();
	JLabel word4 = new JLabel();
	ImageIcon sun = new ImageIcon("sun.png");
	ImageIcon moon = new ImageIcon("moon.png");
	Dimension cardSize = new Dimension(200, 200);
	int counterCount = 0;
	String buttonText1 = "";
	String buttonText2 = "";

	public static void main(String[] args) {
		Matching go = new Matching();
		go.setUI();

	}

	public void setUI() {
		frame.add(panel);
		panel.add(card1);
		panel.add(card2);
		panel.add(counter);
		panel.add(card3);
		panel.add(card4);
		counter.setText("" + counterCount);
		word1.setText("sun");
		word2.setText("moon");
		word3.setText("sun");
		word4.setText("moon");
		card1.add(word1);
		card2.add(word2);
		card3.add(word3);
		card4.add(word4);
		word1.show(false);
		word2.show(false);
		word3.show(false);
		word4.show(false);
		frame.setVisible(true);
		frame.setSize(500, 500);
		card1.setPreferredSize(cardSize);
		card2.setPreferredSize(cardSize);
		card3.setPreferredSize(cardSize);
		card4.setPreferredSize(cardSize);
		card1.addActionListener(this);
		card2.addActionListener(this);
		card3.addActionListener(this);
		card4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof JButton) {
			counter.setText("" + counterCount++);
			if (counterCount % 2 == 1) {
				buttonText1 = ((JButton) e.getSource()).getText();
				((JButton) e.getSource()).getLabel();
			} else if (counterCount % 2 == 0) {
				buttonText2 = ((JButton) e.getSource()).getText();
				((JButton) e.getSource()).show(true);
				if (!buttonText1.equals(buttonText2)) {

				}
			}
		}
	}

	/*
	 * public void setIcons(){ card1.setIcon(sun); card2.setIcon(moon);
	 * card3.setIcon(sun); card4.setIcon(moon); }
	 */

}
