import java.util.*;
public class removefromlist {
	 public static void main(String args[])
	    {
	  
	        
	        AbstractList<String>
	            list = new LinkedList<String>();
	  
	        
	        list.add("hi");
	        list.add("whats");
	        list.add("up");
	        list.add("with");
	        list.add("you");
	  
	       
	        System.out.println("Original List: "
	                           + list);
	  
	        
	        list.subList(1, 3).clear();
	  
	        
	        System.out.println("Final List: "
	                           + list);
	    }
}
