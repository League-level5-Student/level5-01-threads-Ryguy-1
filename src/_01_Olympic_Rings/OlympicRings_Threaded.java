package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot robo1 = new Robot();
		Robot robo2 = new Robot();
		Robot robo3 = new Robot();
		Robot robo4 = new Robot();
		Robot robo5 = new Robot();
		robo1.setPenColor(Color.red);
		robo2.setPenColor(Color.blue);
		robo3.setPenColor(Color.green);
		robo4.setPenColor(Color.yellow);
		robo5.setPenColor(Color.pink);
		
	
		
		robo1.moveTo(100, 100);
		robo2.moveTo(200,200);
		robo3.moveTo(300,100);
		robo4.moveTo(400, 200);
		robo5.moveTo(500, 100);
		
		
		robo1.penDown();
		robo2.penDown();
		robo3.penDown();
		robo4.penDown();
		robo5.penDown();
		
		Thread r1 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				robo1.move(1);
				robo1.turn(1);
			}
		});
		Thread r2 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				robo2.move(1);
				robo2.turn(1);
			}
		});
		Thread r3 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				robo3.move(1);
				robo3.turn(1);
			}
		});
		Thread r4 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				robo4.move(1);
				robo4.turn(1);
			}
		});
		Thread r5 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				robo5.move(1);
				robo5.turn(1);
			}
		});
		robo1.setSpeed(10);
		robo2.setSpeed(10);
		robo3.setSpeed(10);
		robo4.setSpeed(10);
		robo5.setSpeed(10);

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();

	}
}
