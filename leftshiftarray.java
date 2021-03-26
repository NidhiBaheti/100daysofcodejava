package codes;
import java.util.Scanner;
public class leftshiftarray {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int x, temp,n;
		System.out.println("enter the number of elements: \n");
		x=sc.nextInt();
		int arr[]= new int[x];
		int ct[]= new int[x];
		for(int i=0;i<x;i++) {
			System.out.println("Enter the \t"+ i + "\t element");
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the number by which you wanna shift");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int j,first;
			first=arr[0];
			for( j=0;j<x-1;j++)
				
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println("the elements are: \n");
		for(int k=0;k<x;k++)
		{
			System.out.println(arr[k]);
		}
		
	}
}


