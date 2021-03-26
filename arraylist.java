package codes;
import java.util.*;
public class arraylist {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int ch,e,c=0;
	 ArrayList<Integer> list=new ArrayList<Integer>();
	 while(true)
	 {
	 System.out.println("do u wanna enter an element");
	 System.out.println("press 1 for yes and 0 for no");
	 ch=sc.nextInt();
	 if(ch==1)
	 {
		e=sc.nextInt();
		list.add(e);
		
	 }
	 else if(ch==0)
	 {
		 System.out.println(list);
		 Iterator itr=list.iterator();
		 while(itr.hasNext())
			c++;
		 System.out.println("the number of elements are \n"+ c);
		 break;
	 }
	 
	 }
	 
}
}
