import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Competition implements ActionListener {
	Dimension dimension = new Dimension(500, 500);
	String person0 = "Chloe";
	String person1 = "Lucas";
	String person2 = "Olivia";
	String person3 = "Tina";
	String person4 = "Vish";
	String person5 = "David";
	String event0 = "100m Dash";
	String event1 = "Hot Dog Eating Contest";
	String event2 = "Water Jousting";
	String event3 = "Scavenger Hunt";
	String event4 = "Egg Balancing";
	String pickedEvent = "";
	String playerJuan = "";
	String playerDos = "";
	int competitorOne = 0;
	int competitorTwo = 0;
	int eventInt = 0;
	String[] names = new String[6];
	String[] events = new String[5];
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton startComp = new JButton();
	JButton firstChoice = new JButton();
	JButton secondChoice = new JButton();
	JLabel desc = new JLabel();
	JLabel eventPrompt = new JLabel();
	JLabel userCount = new JLabel();
	JLabel eventName = new JLabel();

	public static void main(String[] args) {
		Competition go = new Competition();
		go.setUI();
		go.addActionListeners();
		go.setArrays();
	}

	void setUI() {
		frame.add(panel);
		panel.add(startComp);
		panel.add(desc);
		startComp.setText("Start The Competition!");
		eventPrompt.setText("Who do you think will win?");
		desc.setText(
				"This competition will consist of 5 events. Each event will have two people compete aginst each other. Bet on the winner to win! Person with the most winning bets wins!");
		frame.setVisible(true);
		frame.pack();
	}

	void pickCompetitors() {
		competitorOne = new Random().nextInt(6);
		competitorTwo = new Random().nextInt(6);
		while (competitorOne == competitorTwo) {
			competitorTwo = new Random().nextInt(6);
		}
		playerJuan = names[competitorOne];
		playerDos = names[competitorTwo];
		firstChoice.setText(playerJuan);
		secondChoice.setText(playerDos);

	}

	void chooseEvent() {
		eventInt = new Random().nextInt(5);
		pickedEvent = events[eventInt];
		eventName.setText(pickedEvent);
	}

	void setArrays() {
		names[0] = person0;
		names[1] = person1;
		names[2] = person2;
		names[3] = person3;
		names[4] = person4;
		names[5] = person5;

		events[0] = event0;
		events[1] = event1;
		events[2] = event3;
		events[3] = event4;
		events[4] = event4;

	}

	void setFirstEvent() {
		panel.add(eventName);
		panel.add(userCount);
		panel.add(eventPrompt);
		panel.add(firstChoice);
		panel.add(secondChoice);
		pickCompetitors();
		chooseEvent();

		frame.setPreferredSize(dimension);

	}

	void addActionListeners() {
		startComp.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(startComp)) {
			startComp.setVisible(false);
			desc.setVisible(false);
			setFirstEvent();
		}
	}

}
