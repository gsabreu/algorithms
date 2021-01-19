package br.com.guilherme.algorithms.competitions.tresnmaisum;

import java.util.Scanner;

public class TresNMaisUm {
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()) {
	    int i = sc.nextInt();
	    int j = sc.nextInt();
	    
	    int maiorCicloAtual = 1;
	    for (int atual = Math.min(i, j); atual <= Math.max(i, j); atual++) {
		int resultado = calculaPara(atual);
		if (resultado > maiorCicloAtual) {
		    maiorCicloAtual = resultado;
		}
	    }
	    System.out.println(i + " " + j + " " + maiorCicloAtual);
	}
	
    }

    private static int calculaPara(int n) {
	int impressos = 1;
	while (n != 1 ) {
	    if(n % 2 == 1) n = n * 3+1;
	    else n = n/2;
	    impressos++;
	}
	return impressos;
    }

}
