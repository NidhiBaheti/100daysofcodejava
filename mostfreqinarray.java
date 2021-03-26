package codes;
import java.util.Scanner;
public class mostfreqinarray {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int x,y,sum=0, vis=-1;
	System.out.println("enter the number of elements: \n");
	x=sc.nextInt();
	int arr[]= new int[x];
	int ct[]= new int[x];
	for(int i=0;i<x;i++) {
		System.out.println("Enter the \t"+ i + "\t element");
		arr[i]=sc.nextInt();
		}
	for(int i=0;i<x;i++) 
	{
		y=arr[i];
		for(int j=0;j<x;j++)
		{
		if(y==arr[j])
		sum++;	
		ct[j]= vis;
		}
	}
	
	}
}
