package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	for (int i = 0; i < args.length; i++) {
		
	}
	
	
}
public static void drawSquare(){
	//square nope
		shape.penDown();
		shape.setPenColor(Color.black);
		shape.setSpeed(10);
		shape.move(60);
		shape.turn(90);
		shape.move(60);
		shape.turn(90);
		shape.move(60);
		shape.turn(90);
		shape.move(60);
	
	
}
static Robot shape = new Robot(); 
}

