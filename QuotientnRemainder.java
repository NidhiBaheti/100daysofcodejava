import java.util.*;
public class QuotientnRemainder {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b;
		float c,d;
		System.out.println(" enter the numbers to be divided");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		d=a%b;
		System.out.println(" The quotient is :"+ c);
		System.out.println(" The remainder is :"+ d);
	}

}
