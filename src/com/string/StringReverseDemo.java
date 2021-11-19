package com.string;
import java.util.Scanner;
import java.util.Stack;

public class StringReverseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString = "class abc{" + 
				 
				"    void method(){" + 
				"        if(true){" + 
				"            int[]  a = 5;" + 
				"        }" + 
				"    }" + 
				"}" + 
				"";
		
		System.out.println("Input String : "+inputString);

		String revString = reverseString(inputString);
		System.out.println("Reverse String : " + revString);

		String reverse = reverseStringUsingStack(inputString);
		System.out.println("Reverse String Using Stack: " + reverse);
		
		String str = "[()]{}{[()()]()}";
		boolean flag = isBalancedEq(inputString);
		if(flag) {
			System.out.println("Balanced Equation");
		}
		
		boolean flag1 = parse(inputString);
		if(flag1) {
			System.out.println("Balanced Equation");
		}
	}

	private static String reverseString(String inputString) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();

		for (int i = inputString.length() - 1; i >= 0; i--) {
			sb.append(inputString.charAt(i));
		}

		return sb.toString();
	}

	public static String reverseStringUsingStack(String inputString) {

		char[] chArr = inputString.toCharArray();

		//char[] revArr = new char[inputString.length()];

		Stack s = new Stack();
		// push all the character in stack
		for (int i = 0; i < inputString.length(); i++) {
			s.push(chArr[i]);
		}

		//System.out.println(s.stack);

		//System.out.println(s.hashCode());

		// pop the character and store in rev str array

		for (int i = 0; i < inputString.length(); i++) {
			chArr[i] = s.pop();
		}

		StringBuffer sb = new StringBuffer();
		for (Character c : chArr) {
			sb.append(c);
		}
		return sb.toString();
	}

	static boolean isBalancedEq(String str) {
		char[] arr = str.toCharArray();
		int n = str.length();
		Stack s = new Stack();
		for (int i = 0; i < n; i++) {
			if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
				s.push(arr[i]);
				continue;
			}

			char c;

			switch (arr[i]) {
			case ')':
				c = s.pop();
				if (c == '{' || c == '[') {
					return false;
				}
				break;

			case '}':
				c = s.pop();
				if (c == '(' || c == '[') {
					return false;
				}
				break;
			case ']':
				c = s.pop();
				if (c == '{' || c == '(') {
					return false;
				}
				break;

			}

		}
		
		
		//System.out.println(s.top);
		return (s.top == -1 ? true : false);
	}

	static class Stack {
		int top = -1;
		char data;
		private int maxsize = 100;

		char[] stack = new char[maxsize];

		void push(char data) {
			if (top == maxsize) {
				System.out.println("Stack Overflow");
				return;
			}
			top++;
			stack[top] = data;
		}

		char pop() {

			if (top == -1) {
				//System.out.println("Stack Underflow");
				return 0;
			}
			return stack[top--];

		}
	}

		static boolean parse(String str){

			Stack s = new Stack();
			int n = str.length();
			for(int i = 0; i< n; i++){
				
				if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[')
					{
						s.push(str.charAt(i));
						continue;	
						
					}
				char c;

				switch(str.charAt(i)){
				case ')' : 
					c = s.pop();
				if(str.charAt(i) == '}' || str.charAt(i) == ']')
					return false;
				break;
				case '}' : 
					c = s.pop();
				if(str.charAt(i) == ')' || str.charAt(i) == ']')
					return false;
				break;
				case ']' : 
					c = s.pop();
				if(str.charAt(i) == '}' || str.charAt(i) == ')')
					return false;
				break;
				}
				
			}
			return (s.top == -1 ? true : false);

		}
}


