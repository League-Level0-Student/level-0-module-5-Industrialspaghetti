package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	shape.penDown();
	shape.setPenColor(Color.black);
	shape.setSpeed(10);
	 drawSquare();
	 drawTriangle();
	 drawCircle();
}
public static void drawSquare(){
	//square nope

		for (int i = 0; i < 4; i++) {
			shape.move(60);
			shape.turn(90);
		}
	
		
	
}
public static void drawTriangle() {
	
	for (int i = 0; i < 3; i++) {
		shape.move(60);
		shape.turn(90);
		
	}
	
}
public static void drawCircle() {
	
}
static Robot shape = new Robot(); 
}

