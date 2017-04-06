import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FartMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton fart1 = new JButton();
	JButton fart2 = new JButton();
	JButton fart3 = new JButton();

	public static void main(String[] args) {
		FartMachine toot = new FartMachine();
		toot.createToots();
	}

	void createToots() {
		frame.add(panel);
		panel.add(fart1);
		panel.add(fart2);
		panel.add(fart3);
		frame.setVisible(true);
		frame.setSize(500, 500);
		fart1.setText("Common Fart");
		fart2.setText("Quickie");
		fart3.setText("Windy Gas");
		fart1.addActionListener(this);
		fart2.addActionListener(this);
		fart3.addActionListener(this);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == fart1) {
			playSound("commonfart.wav");
		}
		if (e.getSource() == fart2) {
			playSound("quickfart.wav");
		}
		if (e.getSource() == fart3) {
			playSound("windyfart.wav");
		}
	}

}
