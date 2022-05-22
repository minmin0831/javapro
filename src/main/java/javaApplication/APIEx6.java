package javaApplication;

import java.util.Arrays;

public class APIEx6 {

	public static void main(String[] args) {
		
		int scores[] = {90, 75, 30, 88, 60};
		
		System.out.println("원본 자료 출력 ");
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
				
		int temp;
		for(int a=0; a<scores.length; a++) {
			for(int b=a+1; b<scores.length-1; b++) {
				if(scores[a] > scores[b]) {
					// true 일 경우, a배열값과 b배열값과 교체해주기 위한 실행구문이다. 
					temp = scores[a];
					scores[a] = scores[b];
					scores[b] = temp;
				}
			}
		}
		System.out.println("Ascending 소트 자료 출력");
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		
		for(int a=0; a<scores.length; a++) {
			for(int b=a+1; b<scores.length; b++) {
				if(scores[a] < scores[b]) {
					// true 일 경우, a배열값과 b배열값과 교체해주기 위한 실행구문이다. 
					temp = scores[a];
					scores[a] = scores[b];
					scores[b] = temp;
				}
			}
		}
		System.out.println("Descending 소트 자료 출력");
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		
		
		
		/*
		System.out.println("\nAscending 소트 자료 출력 "); // sort 기본 정렬방식은 ascending sort 방식이다. 
		Arrays.sort(scores);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		
		System.out.println("\nDescending 소트 자료 출력 "); // sort 기본 정렬방식은 ascending sort 방식이다. 
		Arrays.sort(scores);
		for(int i=scores.length-1; i<scores.length; i--) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		*/
		
		/*
		String[] names = {"John Doe", "Jane Doe", "Dwane Johns", "James Gosling", "Steven Yeon"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		
		Member m1 = new Member("John Doe");
		Member m1 = new Member("John Doe");
		Member m1 = new Member("John Doe");
		Member m1 = new Member("John Doe");
		Member m1 = new Member("John Doe");
		*/
		
	}

}
