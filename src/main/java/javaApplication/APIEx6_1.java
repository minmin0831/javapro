package javaApplication;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class APIEx6_1 {
	public static void main(String[] args) {
		Integer scores[] = {90, 75, 30, 88, 60};
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("Ascending 소트 자료 출력");
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
	}
}
