package src.Test;

import java.util.Scanner;

import src.Base.Director;
import src.Security.*;

public class LiMianHong_sixDP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		Integer timeSpeed;
		while(flag) {
			Director.getInstance().nextRound();
			Integer time = Director.getInstance().getCurrentTime();
			System.out.println("(The current game time is " +  time.toString() + ":00)");
			
			int i = sc.nextInt();
			switch (i) {
			case 0:
				flag = false;
				break;
			case 1:
				SecuritySystem.getInstance().Check();
				break;
			case 2:
				SecuritySystem.getInstance().Attack();
				break;
			case 3:
				Director.getInstance().accelerateTimeSpeed();
				timeSpeed = Director.getTimeSpeed();
				System.out.println("Now the timeSpeed is " + timeSpeed.toString());
				break;
			case 4:
				Director.getInstance().slowTimeSpeed();
				timeSpeed = Director.getTimeSpeed();
				System.out.println("Now the timeSpeed is " + timeSpeed.toString());
				break;
			case 5:
				Director.getInstance().undoClockOperation();
				time = Director.getInstance().getCurrentTime();
				System.out.print("The current game time is " +  time.toString() + ":00      ");
				timeSpeed = Director.getTimeSpeed();
				System.out.println("Now the timeSpeed is " + timeSpeed.toString());
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}
