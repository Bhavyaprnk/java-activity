/**
 * 
 */

/**
 * @author welcome
 *
 */
   public class Classproject 
  {
     public static void main(String[] args)
     {
	      int score = 67;
	      String grade = null;
	     switch(score/10) {
	         case 10:
	        case 9:
	           grade = "A";
	           break;
	        case 8:
	           grade = "B";
	           break;
	        case 7:
	           grade = "C";
	           break;
	        case 6:
	           grade = "D";
	           break;
	       case 5:
	           grade = "E";
	           break;
	       default:
	           grade = "F";
	           break;
	      }
	      System.out.println("Grade = " + grade);
	   }
}

