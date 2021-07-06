package stackDemo;

import java.util.HashMap;

public class BalanceBracket {
	
	boolean isValidBracket() {
		GenericStack<Character> stack = new GenericStack<Character>(10);
		String input = "{}([()])";
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
				stack.push(input.charAt(i));
			}
			else {
				Character currentBracket = stack.pop();
				currentBracket = map.get(currentBracket);
				if(currentBracket != input.charAt(i)) {
					System.out.println("Invalid bracket...");
					return false;
				}
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Valid Brackets...");
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
