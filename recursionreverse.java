import java.util.*;
public class recursionreverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    String sentence;
	    
	   
	    System.out.println("Enter the sentence");
	    sentence= sc.next();
	    String reversed = reverse(sentence);
	    System.out.println("The reversed sentence is: " + reversed);
	  }

	  public static String reverse(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;

	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	  }

}
