
public class Casino {
	public static void main(String[] args) {
		SlotMachine slots = new SlotMachine();
		slots.askBet();
		slots.generateRandomNums();
		slots.setUI();
		slots.checkNums();
		slots.addCash();
		
	}

}
