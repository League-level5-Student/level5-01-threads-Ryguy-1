package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static boolean isWinner = false;
	
public static void main(String[] args) {
	

	
	Robot robo1 = new Robot();
	Robot robo2 = new Robot();
	Robot robo3 = new Robot();
	Robot robo4 = new Robot();
	Robot robo5 = new Robot();
	
	robo1.moveTo(100, 800);
	robo2.moveTo(400, 800);
	robo3.moveTo(700, 800);
	robo4.moveTo(1000, 800);
	robo5.moveTo(1300, 800);
	
	
	robo1.setPenColor(Color.red);
	robo2.setPenColor(Color.blue);
	robo3.setPenColor(Color.green);
	robo4.setPenColor(Color.yellow);
	robo5.setPenColor(Color.pink);
	
	Random rd = new Random();
	
	
	Thread r1 = new Thread(() -> {
		while(isWinner == false) {	
		robo1.move(rd.nextInt(10));
		if(robo1.getY()<=100) {
			isWinner = true;
			JOptionPane.showMessageDialog(null, "Robot 1 has won!");
		}
		}
	});
	Thread r2 = new Thread(() -> {
		while(isWinner == false) {
			robo2.move(rd.nextInt(10));
			if(robo2.getY()<=100) {
				isWinner = true;
				JOptionPane.showMessageDialog(null, "Robot 2 has won!");
			}
		}
	});
	Thread r3 = new Thread(() -> {
		while(isWinner == false) {
		robo3.move(rd.nextInt(10));
		if(robo3.getY()<=100) {
			isWinner = true;
			JOptionPane.showMessageDialog(null, "Robot 3 has won!");
		}
		}
	});
	Thread r4 = new Thread(() -> {
		while(isWinner == false) {
		robo4.move(rd.nextInt(10));
		if(robo4.getY()<=100) {
			isWinner = true;
			JOptionPane.showMessageDialog(null, "Robot 4 has won!");
		}
		}
	});
	Thread r5 = new Thread(() -> {
		while(isWinner == false) {
		robo5.move(rd.nextInt(10));
		if(robo5.getY()<=100) {
			isWinner = true;
			JOptionPane.showMessageDialog(null, "Robot 5 has won!");
		}
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
