package ProblemSolving;

import java.util.Arrays;
import java.util.Hashtable;

/*
 * source: https://leetcode.com/problems/roman-to-integer/
 * */

public class RomanToInteger {
	
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
	int[] val = {1, 5, 10, 50, 100, 500, 1000};
	
	static public int romanToInt(String s) {
		if(s == null || s.length() == 0) {
			return 0;
		}
		int res = 0;
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			switch(c) {
			case 'M':
				res += 1000;
				break;
			case 'D':
				res += 500;
				break;
			case 'C':
				res += 100 * (res >= 500 ? -1 : 1);
				break;
			case 'L':
				res += 50;
				break;
			case 'X':
				res += 10 * (res >= 50 ? -1 : 1);
				break;
			case 'V':
				res += 5;
				break;
			case 'I':
				res += (res >= 5 ? -1 : 1);
				break;
			default:
				break;
			}
		}
		
		return res;
	}

}
