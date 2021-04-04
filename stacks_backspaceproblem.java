import java.util.*;
public class stacks_backspaceproblem {
	static String newString(String S) 
	{ 
	    Stack<Character> q = new Stack<Character>(); 
	  
	    for (int i = 0; i < S.length(); ++i) 
	    { 
	        if (S.charAt(i) != '#') 
	            q.push(S.charAt(i)); 
	        else if (!q.isEmpty()) 
	            q.pop(); 
	    } 
	  
	    String ans = ""; 
	  
	    while (!q.isEmpty())
	    { 
	        ans += q.pop(); 
	    }
	    
	    String answer = "";
	    for(int j = ans.length() - 1; j >= 0; j--)
	    {
	        answer += ans.charAt(j);
	    }
	    return answer; 
	} 
	  
	// Driver Code 
	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
	    String S = sc.next(); 
	    System.out.println(newString(S)); 
	}

}
