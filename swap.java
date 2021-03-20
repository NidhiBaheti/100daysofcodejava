import java.util.Scanner;

public class swap {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int a,b,temp;
	System.out.println(" enter the numbers to be swapped");
	
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("The value of a before swapping " + a);
	System.out.println("The value of b before swapping"+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("the value of a after swapping" +a );
	System.out.println("the value of b fter swapping" +b);
	
	}
}
