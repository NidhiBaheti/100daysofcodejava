import java.util.*;
public class lcm {
	 public static void main(String[] args) {

		    int n1,n2, lcm;
		    Scanner reader = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	         n1 = reader.nextInt();
	         n2 = reader.nextInt();
		    // maximum number between n1 and n2 is stored in lcm
		    lcm = (n1 > n2) ? n1 : n2;

		    // Always true
		    while(true) {
		      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
		        break;
		      }
		      ++lcm;
		    }
		  }

}
