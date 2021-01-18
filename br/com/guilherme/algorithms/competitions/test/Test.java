package br.com.guilherme.algorithms.competitions.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while (true) {
	    int numero = scanner.nextInt();
	    if(numero == 42) break;
	    System.out.println(numero);
	    if(!scanner.hasNext()) break;
	}

    }
}
