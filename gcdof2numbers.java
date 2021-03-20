import java.util.*;
public class gcdof2numbers {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    double n1,n2,n3=0;
    System.out.println(" enter the numbers to be");
	n1=sc.nextDouble();
	n2=sc.nextDouble();
	for (int i = 1; i <= n1 && i <= n2; ++i) {

	      // check if i perfectly divides both n1 and n2
	      if (n1 % i == 0 && n2 % i == 0)
	        n3= i;
	    }

	    System.out.println("GCD of " + n1 +" and " + n2 + " is " + n3);
}}
