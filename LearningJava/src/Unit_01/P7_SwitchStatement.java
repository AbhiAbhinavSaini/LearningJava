package Unit_01;

/* Problem Statement: P7_SwitchStatements: 
Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
* */

import java.util.Scanner;
public class P7_SwitchStatement {
	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();
	}
}
class SwitchStatements {
	void switchStatements() {
		Scanner in = new Scanner(System.in);
		System.out.println("1)Current year\t2)Current Month\t3)Current Day\t4)Surprise");
		System.out.print("Enter your choice : ");
		int num = in.nextInt();
		switch(num) {
		case 1:System.out.println("Current year is 2022");
				break;
		case 2:System.out.println("Current month is April");
			break;
		case 3:System.out.println("Current day is Saturday");
			break;
		case 4:System.out.println("Not applicable");
			break;
		default:System.out.println("Please enter valid choice");
		}
	}
}