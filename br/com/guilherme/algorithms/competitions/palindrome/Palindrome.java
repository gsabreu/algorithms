package br.com.guilherme.algorithms.competitions.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int casos = sc.nextInt();
	sc.nextLine();
	for (int i = 1; i <= casos; i++) {
	    if(isPalindrome(sc.nextLine())) {
		System.out.println(i + " \"YES\"");
	    } else {
		System.out.println(i + " \"NO\"");
	    }
	}
    }

    private static boolean isPalindrome(String palavra) {
	String invertido = new StringBuilder(palavra).reverse().toString();
	return palavra.equals(invertido);
    }
}
