import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s;
 
		while (true) {
 
			s = in.nextLine();
 
			if (s.equals(".")) { // 종료 조건문
				break;
			}
 
			sb.append(solve(s)).append('\n');
		}
 
		System.out.println(sb);
	}
 
	public static String solve(String s) {
		
		char[] stack = new char[s.length()];	// 스택처럼 사용할 비열 
		int size = 0;
 
		for (char val : s.toCharArray()) {
			
			// 여는 괄호일 경우 배열에 저장 후 size 1증가 
			if (val == '(' || val == '[') {
				stack[size] = val;
				size++;
			} 
			
			// 닫는 소괄호일경우 
			else if (val == ')') {
				
				// 요소가 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우 
				if (size == 0 || stack[size - 1] != '(') {
					return "no";
				} 
				else {
					size--;
				}
			} 
			
			// 닫는 소괄호일경우 
			else if (val == ']') {
				
				// 요소가 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우 
				if (size == 0 || stack[size - 1] != '[') {
					return "no";
				} 
				else {
					size--;
				}
			}
		}
		
		if (size != 0) {
			return "no";
		} 
		else {
			return "yes";
		}
	}
}
