/**
 * 2.  Write a java program that simulates a traffic light. 
   The program lets the user select one of three lights: red, yellow, or green with radio buttons.
   On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console.
 * Initially there is no message shown.
 * @author Shweta Keerti
 *
 */

import java.util.Scanner;

public class TrafficLight {
	
	public static void TrafficColor(String color) {
		switch(color) {
		case "red": System.out.println("stop");
		break;
		case "yellow": System.out.println("ready");
		break;
		case "green": System.out.println("go");
		break;
		default: System.out.println("color is invalid");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String color= sc.next();
	TrafficColor(color);
	sc.close();
	}
}
