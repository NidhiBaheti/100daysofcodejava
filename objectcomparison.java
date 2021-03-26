package codes;
import java.util.Scanner;
public class objectcomparison {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);  
    Double x, y; 
    boolean k;
    System.out.println("enter the numbers to be compared");
    x=sc.nextDouble();
    y=sc.nextDouble();
    k=x.equals(y);
    if(k==true)
    System.out.println("thrye equal");
    else
    	System.out.println("thrye not equal");
    
    }
}