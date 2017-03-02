import javax.swing.JOptionPane;

public class MenuData {
	String menuItem1 = "Burger 1000¢";
	String menuItem2 = "Hot Dog 700¢";
	String menuItem3 = "Pizza 1500¢";
	String menuItem4 = "Steak 1700¢";

	String getmenuItem1() {
		return menuItem1;
	}

	String getmenuItem2() {
		return menuItem2;
	}

	String getmenuItem3() {
		return menuItem3;
	}

	String getmenuItem4() {
		return menuItem4;
	}
	
	void checkOrder(String myOrder){
		if(myOrder.equalsIgnoreCase("Burger")){
			JOptionPane.showMessageDialog(null, "Here is your burger!");
		}else if(myOrder.equalsIgnoreCase("Hot Dog")){
			JOptionPane.showMessageDialog(null, "Here is your hot dog!");
		}else if(myOrder.equalsIgnoreCase("Pizza")){
			JOptionPane.showMessageDialog(null, "Here is your pizza!");
		}else if(myOrder.equalsIgnoreCase("Steak")){
			JOptionPane.showMessageDialog(null, "Here is your steak!");
		}else{
			JOptionPane.showMessageDialog(null, "Sorry we don't have that here.");
		}
	}

}
