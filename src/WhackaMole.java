import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
	public static void main(String[] args) {
		WhackaMole mole = new WhackaMole();
		mole.drawButtons(0);

	}

	int moleWhacks;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	JButton button12 = new JButton();
	JButton button13 = new JButton();
	JButton button14 = new JButton();
	JButton button15 = new JButton();
	JButton button16 = new JButton();
	JButton button17 = new JButton();
	JButton button18 = new JButton();
	JButton button19 = new JButton();
	JButton button20 = new JButton();
	JButton button21 = new JButton();
	JButton button22 = new JButton();
	JButton button23 = new JButton();
	JButton button24 = new JButton();
	int randomNum = new Random().nextInt(24);
	JButton[] JButtonArray = new JButton[24];

	public int drawButtons(int x) {
		setArray();
		frame.add(panel);
		addButtons();
		addActionListeners();

		JButtonArray[randomNum].setText("Mole!");
		frame.setVisible(true);
		frame.setSize(250, 300);

		return x;
	}

	public void addButtons() {
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
	}

	public void addActionListeners() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);
		button21.addActionListener(this);
		button22.addActionListener(this);
		button23.addActionListener(this);
		button24.addActionListener(this);
	}

	public void setArray() {
		JButtonArray[0] = button1;
		JButtonArray[1] = button2;
		JButtonArray[2] = button3;
		JButtonArray[3] = button4;
		JButtonArray[4] = button5;
		JButtonArray[5] = button6;
		JButtonArray[6] = button7;
		JButtonArray[7] = button8;
		JButtonArray[8] = button9;
		JButtonArray[9] = button10;
		JButtonArray[10] = button11;
		JButtonArray[11] = button12;
		JButtonArray[12] = button13;
		JButtonArray[13] = button14;
		JButtonArray[14] = button15;
		JButtonArray[15] = button16;
		JButtonArray[16] = button17;
		JButtonArray[17] = button18;
		JButtonArray[18] = button19;
		JButtonArray[19] = button20;
		JButtonArray[20] = button21;
		JButtonArray[21] = button22;
		JButtonArray[22] = button23;
		JButtonArray[23] = button24;
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(JButtonArray[randomNum])) {
			playSound("ding.mp3");
			moleWhacks++;
			JButtonArray[randomNum].setText("");
			randomNum = new Random().nextInt(24);
			JButtonArray[randomNum].setText("Mole!");
		} else {
			speak("You lose");

		}
		if (moleWhacks == 5) {
			speak("You win");

		}
	}

}
