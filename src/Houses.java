import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		HouseCreator create = new HouseCreator(true, 500);
		create.moveToCorner();
		
		String height = "large";
		Color color = Color.black;
		
		for (int i = 0; i < 9; i++) {
			//create.setRandomHeight();
			int size = new Random().nextInt(3);
			if(size == 0){
				height = "small";
			}
			if(size == 1){
				height = "medium";
			}
			if(size == 2){
				height = "large";
			}
			int colorNumber = new Random().nextInt(3);
			if(colorNumber == 0){
				color = Color.BLUE;
			}
			if(colorNumber == 1){
				color = Color.ORANGE;
			}
			if(colorNumber == 2){
				color = Color.MAGENTA;
			}
			create.drawHouseAndGrass(height, color);
	
		}
		
		//create.drawHouseAndGrass(any);
		
	}
	

	

}
