import java.util.*;
public class largestelementinarray {

	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        double[] numArray = new double[10];
	        for(int i=0;i<10;i++)
	        {
	        	System.out.println("Enter the "+ i+1 + "th element:");
	        	numArray[i]= sc.nextDouble();
	        }
	        double largest = numArray[0];

	        for (double num: numArray) {
	            if(largest < num)
	                largest = num;
	        }

	        System.out.format("Largest element = %.2f", largest);
	    }
}
