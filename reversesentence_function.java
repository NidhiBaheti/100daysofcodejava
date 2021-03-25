import java.util.*;
public class reversesentence_function {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
	    String sentence = sc.next();
	    String reversed = reverse(sentence);
	    System.out.println("The reversed sentence is: " + reversed);
	  }

	  public static String reverse(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;

	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	  }

}
