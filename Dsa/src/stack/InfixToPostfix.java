package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {

	public static String infixToPostfix(String infixExpression)
	{
		StringBuilder postfix=new StringBuilder();
		Deque<Character>stack=new ArrayDeque<>();
		char[]input=infixExpression.toCharArray();
		//S
		for(char c:input) 
		{
			if(Character.isLetterOrDigit(c))
			{
				postfix.append(c);
			}
			//P
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')') 
				//o
			{
				while(!stack.isEmpty()&&stack.peek() !='(') 
				{
					postfix.append(stack.pop());
				}
				stack.pop();
			}
		
			else {
				while(!stack.isEmpty()&&stack.peek() !='(' && getPrecedence(stack.peek())>=getPrecedence(c)) 
				{
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
			//E
		}
		while(!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		
		return postfix.toString();
		
	}
	
	private static int getPrecedence(Character ch) {
		return switch(ch) {
		case '^'->3;
		case '/','*'->2;
		case '+','-'->1;
		default -> throw new IllegalArgumentException("Unexpected value: " + ch);
		};
	}

	public static void main(String[] args) {
		String infixExpression="A+B*C";
		System.out.println("Infix expression : "+infixExpression);
		System.out.println("Infix expression: "+infixToPostfix(infixExpression));
	}

}
