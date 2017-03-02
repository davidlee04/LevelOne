import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton order = new JButton();
	JTextField orderName = new JTextField(20);
	JLabel item1 = new JLabel();
	JLabel item2 = new JLabel();
	JLabel item3 = new JLabel();
	JLabel item4 = new JLabel();

	public Menu() {
		panel.setLayout(new GridLayout(4, 2));
		frame.add(panel);
		panel.add(item1);
		panel.add(item2);
		panel.add(item3);
		panel.add(item4);
		panel.add(order);
		panel.add(orderName);
		order.setText("Send Order");
		frame.setVisible(true);
		frame.setSize(500, 500);

	}

	public void setItem1(String food1) {
		item1.setText(food1);
	}

	public void setItem2(String food2) {
		item2.setText(food2);
	}

	public void setItem3(String food3) {
		item3.setText(food3);
	}

	public void setItem4(String food4) {
		item4.setText(food4);
	}

	public void menuPack() {
		frame.pack();
	}

	public void addActionListener(ActionListener controller) {
		order.addActionListener(controller);
	}
	
	public String getOrder(){
		return orderName.getText();
	}

}
