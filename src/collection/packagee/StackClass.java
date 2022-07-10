package collection.packagee;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {

		Stack<Character> data = new Stack<>();

		data.push('A');
		data.push('B');
		data.push('C');
		data.add('D');
		System.out.println(data.get(1));
		char ch = data.pop();
		System.out.println(ch);
		data.remove(0);

		System.out.println(data);

	}

}
