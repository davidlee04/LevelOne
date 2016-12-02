import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
	public static void main(String[] args) {
		PigLatinTranslator translate = new PigLatinTranslator();
		translate.translator();
	}
	JTextField text = new JTextField();
	JTextField out = new JTextField();

	private void translator() {
		Dimension size = new Dimension(300,20);
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Translate");
		
	    text.setPreferredSize(size);
	    out.setPreferredSize(size);
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(out);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		out.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		PigLatin thing = new PigLatin();
		String a = thing.translate(text.getText());
		out.setText(a);
	}
	
}
