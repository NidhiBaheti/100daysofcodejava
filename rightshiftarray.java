package codes;
import java.util.Scanner;
public class rightshiftarray {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int x, n;
		System.out.println("enter the number of elements: \n");
		x=sc.nextInt();
		int arr[]= new int[x];
		for(int i=0;i<x;i++) {
			System.out.println("Enter the \t"+ i + "\t element");
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the number by which you wanna shift");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int last,j;
			last=arr[x-1];
			for(j=x-1;j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			arr[0]=last;
		}
		System.out.println("the elements are: \n");
		for(int k=0;k<x;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
