import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuController implements ActionListener {
	Menu menu;
	MenuData md;

	public MenuController(Menu menu, MenuData md) {
		// TODO Auto-generated constructor stub
		this.menu = menu;
		this.md = md;
		setup();
		menu.addActionListener(this);

	}

	void setup() {
		menu.setItem1(md.getmenuItem1());
		menu.setItem2(md.getmenuItem2());
		menu.setItem3(md.getmenuItem3());
		menu.setItem4(md.getmenuItem4());
		
		menu.menuPack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(menu.order)){
			if(menu.orderName.getText().equalsIgnoreCase("burger")){
				JOptionPane.showMessageDialog(null, "Here is your burger!");
			}
		}
	}
	

}
