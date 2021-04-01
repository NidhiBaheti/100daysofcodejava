import java.util.*;
public class userinputarraylist {
	public static void main(String args[]){
        List l=new ArrayList();
        System.out.println("Enter the input");
        Scanner input=new Scanner(System.in);

         String a =input.nextLine();
         l.add(a);
     for (int i = 0; i < l.size(); i++) {
        System.out.println(l.get(i));
      } 
            System.out.println(l);

    }
}
