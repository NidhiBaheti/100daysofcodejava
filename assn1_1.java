



package assn1;

import java.util.Scanner;

public class assn1_1 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub 
        employeedetails e = new employeedetails(); 
        System.out.println("Enter your salary"); 
        Scanner sc = new Scanner(System.in); 
        e.sal=sc.nextInt(); 
        System.out.println("My id is: "+e.getid()); 
        e.profession(); 
        e.display(); 
   }
}

class employeedetails{ 
   private String id="201"; 
   public int sal; 
   protected void profession() 
   { 
       System.out.println("I work for Versace"); 
   }
   public String getid() 
   {
        return this.id; 
   }
   public void display() 
   { 
       System.out.println("My Salary is " +"Rs."+ sal); 
   } 
}
