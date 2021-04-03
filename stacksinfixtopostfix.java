import java.util.*;
public class stacksinfixtopostfix {
	public static int prec(char c)
    {
        // Multiplication and division
        if (c == '×' || c == '/') {
            return 3;
        }
 
        // Addition and subtraction
        if (c == '+' || c == '-') {
            return 4;
        }
 
        // Bitwise AND
        if (c == '&') {
            return 8;
        }
 
        // Bitwise XOR (exclusive or)
        if (c == '^') {
            return 9;
        }
 
        // Bitwise OR (inclusive or)
        if (c == '|') {
            return 10;
        }
 
        // add more operators if needed
 
        return Integer.MAX_VALUE;            // for opening bracket `(`
    }
 
    // Utility function to check if a given token is an operand
    public static boolean isOperand(char c)
    {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9');
    }
 
    // Function to convert an infix expression to a postfix expression.
    // This function expects a valid infix expression
    public static String infixToPostfix(String infix)
    {
        // create an empty stack for storing operators
        Stack<Character> s = new Stack<>();
 
        // create a string to store the postfix expression
        String postfix = "";
 
        // process the infix expression from left to right
        for (char c: infix.toCharArray())
        {
            // Case 1. If the current token is an opening bracket `(`,
            // push it into the stack
            if (c == '(') {
                s.add(c);
            }
            // Case 2. If the current token is a closing bracket `)`
            else if (c == ')')
            {
                // pop tokens from the stack until the corresponding opening
                // bracket `(` is removed. Append each operator at the end
                // of the postfix expression
                while (s.peek() != '(') {
                    postfix += s.pop();
                }
                s.pop();
            }
 
            // Case 3. If the current token is an operand, append it at the end
            // of the postfix expression
            else if (isOperand(c)) {
                postfix += c;
            }
 
            // Case 4. If the current token is an operator
            else {
                // remove operators from the stack with higher or equal precedence
                // and append them at the end of the postfix expression
                while (!s.isEmpty() && prec(c) >= prec(s.peek())) {
                    postfix += s.pop();
                }
 
                // finally, push the current operator on top of the stack
                s.add(c);
            }
        }
 
        // append any remaining operators in the stack at the end
        // of the postfix expression
        while (!s.isEmpty()) {
            postfix += s.pop();
        }
 
        // return the postfix expression
        return postfix;
    }
 
    public static void main(String[] args)
    {
        String infix = "A×(B×C+D×E)+F";
 
        String postfix = infixToPostfix(infix);
        System.out.println(postfix);
    }
}
