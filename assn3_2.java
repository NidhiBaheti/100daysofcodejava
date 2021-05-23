/*b. Create a class named 'Programming'. While creating an object of the 
class, if nothing is passed to it, then the message "I love programming 
languages" should be printed. If some String is passed to it, then in place 
of "programming languages" the name of that String variable should be 
printed.
For example, while creating object if we pass "Java", then "I love Java" 
should be printed. */

package assn3;

import java.util.Scanner;

class programming {
    private String lang="Programming Languages"; 
    programming(String lang) 
    { 
        System.out.println("I love "+lang); 
    }
    programming() 
    { 
        System.out.println("I love "+lang);
    } 
}

public class getlang {
    public static void main(String[] args) 
    { 
        // TODO Auto-generated method stub 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a Programming Language"); 
        String lang= sc.nextLine(); 
        programming pg1 = new programming(lang); 
        programming pg2 = new programming(); 
        sc.close(); 
    }

}