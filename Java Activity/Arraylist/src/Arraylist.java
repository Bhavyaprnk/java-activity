/**
 * 
 */

/**
 * @author welcome
 *
 */
import java.util.*; 
public class Arraylist{  
 public static void main(String args[]){  
  Arraylist<String> list=new Arraylist<String>();
  list.add("Mango");   
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
   Iterator itr=list.iterator();
  while(itr.hasNext()){  
   System.out.println(itr.next());
  }  
 }  
}