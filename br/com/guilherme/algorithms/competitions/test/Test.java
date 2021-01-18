package br.com.guilherme.algorithms.competitions.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while (scanner.hasNext()) { 
	    int numero = scanner.nextInt();
	    if(scanner.nextInt() == 42) break;
	    System.out.println(numero);
	}

    }
}
