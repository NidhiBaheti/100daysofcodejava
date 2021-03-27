import java.util.*;
public class secondlargestelement {
	static void print2largest(int arr[],
            int arr_size)
{
int i, first, second;

// There should be
// atleast two elements
if (arr_size < 2)
{
System.out.printf(" Invalid Input ");
return;
}


Arrays.sort(arr);

for (i = arr_size - 2; i >= 0; i--)
{

if (arr[i] != arr[arr_size - 1])
{
System.out.printf("The second largest " +
          "element is %d\n", arr[i]);
return;
}
}

System.out.printf("There is no second " +
      "largest element\n");
}

//Driver code
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
int arr[] = new int[10];
for(int i=0;i<10;i++) {
	System.out.println("enter");
	arr[i]= sc.nextInt();
	}
int n = arr.length;
print2largest(arr, n);
}
}

