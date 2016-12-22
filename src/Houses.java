import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		HouseCreator create = new HouseCreator(true, 500);
		create.moveToCorner();
		for (int i = 0; i < 2; i++) {
			create.setRandomHeight();
			create.drawHouseAndGrass();
		
			
		}
		String any = "small";
		create.drawHouseAndGrass(any);
		
	}
	

	

}
