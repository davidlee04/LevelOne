import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CPS implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton clickBox = new JButton();
	JLabel clickCounter = new JLabel();
	Timer timer = new Timer(1, this);
	
	public static void main(String[] args) {
		CPS cps = new CPS();
		cps.setUI();
	}
	
	public void setUI(){
		frame.add(panel);
		panel.add(clickBox);
		clickBox.addActionListener(this);
		frame.setSize(500, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(clickBox)){
			timer.start();
			
		}
		
	}


}
