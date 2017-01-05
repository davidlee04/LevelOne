import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class HouseCreator {
	Robot jim;
	boolean alive;
	int height;
	Color color;
	int range;

	public HouseCreator(boolean alive, int range) {
		// TODO Auto-generated constructor stub
		this.range = range;
		this.jim = new Robot();
		this.alive = alive;
		
		
	}
	
	void moveToCorner(){
		jim.moveTo(50, 875);
		
	}
	
	void drawHouseAndGrass(){
		jim.penDown();
		jim.setPenColor(color);
		jim.setSpeed(10);
		jim.move(height);
		drawFlatRoof();
		jim.move(height);
		jim.turn(270);
		jim.setPenColor(Color.GREEN);
		jim.move(80);
		jim.turn(270);

	}
	
	void drawHouseAndGrass(String strHeight, Color houseColor){
		if(houseColor.equals(Color.BLUE)){
			color = Color.BLUE;
		}
		if(houseColor.equals(Color.ORANGE)){
			color = Color.ORANGE;
		}
		if(houseColor.equals(Color.MAGENTA)){
			color = Color.MAGENTA;
		}

		if(strHeight.equals("small")){
			height = 60;
		}else if(strHeight.equals("medium")){
			height = 120;
		}else if(strHeight.equals("large")){
			height = 250;
		}
		drawHouseAndGrass();

	}
	
	void drawPointyRoof(){
		jim.turn(45);
		jim.move(20);
		jim.turn(90);
		jim.move(20);
		jim.turn(45);
	}
	
	void drawFlatRoof(){
		jim.turn(90);
		jim.move(75);
		jim.turn(90);
	}
	
	/*void setRandomHeight(){
		height = new Random().nextInt(range);
		
	}*/

}
