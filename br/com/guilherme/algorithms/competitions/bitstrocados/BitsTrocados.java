package br.com.guilherme.algorithms.competitions.bitstrocados;

import java.util.Scanner;

public class BitsTrocados {
    public static void main(String[] args) {
 
	Scanner sc = new Scanner(System.in);
	int count =1;
	int notes[] = {50,10,5,1}; 
	while (sc.hasNext()) {
	    int valorSaque = sc.nextInt();
	    if(valorSaque > 0) {
		System.out.println("Teste " + count);
		valorSaque = getNotes(valorSaque, notes[0]);
		System.out.print(" ");
		valorSaque = getNotes(valorSaque, notes[1]);
		System.out.print(" ");
		valorSaque = getNotes(valorSaque, notes[2]);
		System.out.print(" ");
		valorSaque = getNotes(valorSaque, notes[3]);
		System.out.println("\n");
	    }
	    count++;
	}
    }

    private static int getNotes(int valorSaque, int noteValue) {
	int value = 0;
	if(valorSaque >= noteValue) {
	    value = valorSaque / noteValue;
	    valorSaque = valorSaque % noteValue;
	    System.out.print(value == 0 ? "1" : value);
	}
	else {
	    System.out.print(0);
	}
	return valorSaque;
    }
}
