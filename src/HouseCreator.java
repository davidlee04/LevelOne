import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class HouseCreator {
	Robot jim;
	boolean alive;
	int height;
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
		jim.setRandomPenColor();
		jim.setSpeed(10);
		jim.move(height);
		jim.turn(90);
		jim.move(75);
		jim.turn(90);
		jim.move(height);
		jim.turn(270);
		jim.setPenColor(Color.green);
		jim.move(80);
		jim.turn(270);

	}
	
	void drawHouseAndGrass(String strHeight){

		if(strHeight.equals("small")){
			height = 60;
		}
		drawHouseAndGrass();

	}
	
	void setRandomHeight(){
		height = new Random().nextInt(range);
		
	}

}
