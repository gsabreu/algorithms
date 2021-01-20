package br.com.guilherme.algorithms.competitions.soma;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int soma = 0;
	int qtd = sc.nextInt();
	
	for (int i = 0; i < qtd; i++) {
	    soma += sc.nextInt();
	}
	System.out.println(soma);
    }
}
