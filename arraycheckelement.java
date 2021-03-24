import java.util.*;
public class arraycheckelement {
	 public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int[] num= new int[10];
       for(int i=0;i<10;i++)
       {
       	System.out.println("Enter the "+ (i+1) + "th element:");
       	num[i]= sc.nextInt();
       }
		    int toFind;
		    System.out.println("enter the element to be found");
		    toFind= sc.nextInt();
		    boolean found = false;

		    for (int n : num) {
		      if (n == toFind) {
		        found = true;
		        break;
		      }
		    }
		    
		    if(found)
		      System.out.println(toFind + " is found.");
		    else
		      System.out.println(toFind + " is not found.");
		  }

}
