/**
 * 
 */

/**
 * @author welcome
 *
 */
import java.util.Scanner;
public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number 1 to 7:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a) {
		case 1:
			System.out.println("Sunday");break;
		case 2:
			System.out.println("Monday");break;
		case 3:
			System.out.println("Tuesday");break;
		case 4:
			System.out.println("Wednesday");break;
		case 5:
			System.out.println("Thursday");break;
		case 6:
			System.out.println("Friday");break;
		case 7:
			System.out.println("Saturday");break;
		default:
			System.out.println("Enter valid input");
		}
	}

}