import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Beetlejuice implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton beetlejuice = new JButton("Beetlejuice");
	int count;

	public void play() {

		frame.setVisible(true);
		frame.add(panel);
		panel.add(beetlejuice);
		beetlejuice.addActionListener(this);
		frame.pack();
	}

	public static void main(String[] args) {
		Beetlejuice show = new Beetlejuice();
		show.play();

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File("/Users/League/Google Drive/league-sounds/creepy-noise.wav");
		else if (whichSound == SCREAM)
			soundFile = new File("/Users/League/Google Drive/league-sounds/scream.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(beetlejuice)) {
			count++;
		}
		if (count == 3) {
			showPictureFromTheInternet("https://pbs.twimg.com/media/BHH4RAmCYAEBs9C.jpg");
			playSound(CREEPY);
		}

	}

}
