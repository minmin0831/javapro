package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger2 {

	static Map<Character, Integer> map = new HashMap();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
		fillMapValues();
		int result = 0; // 2. define and initialize result variable with the initial value of 0
		
		for(int i=0; i<s.length()-1; i++) { // 3. declare for loop to read through all char elements of arg String s except for the very last element. 
			if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) // 4. ask if the first element is smaller than the second element, avoiding outOfRange exception. 
				result -= map.get(s.charAt(i));	// 5. if smaller, subtract the value mapped to the first element.
			else 
				result += map.get(s.charAt(i)); // 6. if bigger, add the value mapped to the first element. 
		}
		result += map.get(s.charAt(s.length()-1)); // 7. add the last element-mapped value to the result value
		return result;
		// I, X, C characters are exceptionally functioning (both add and subtract values mapped to each characters) in this logic, hence compare the adjacent elements by if statement. 
	}
	
	public static void fillMapValues() { // 1. store char and int data into hash table
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

}
