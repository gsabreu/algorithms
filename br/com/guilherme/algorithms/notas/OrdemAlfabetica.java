package br.com.guilherme.algorithms.notas;

public class OrdemAlfabetica {
    public static void main(String[] args) {
	String[] nomes = {
	        "Andressa",
	        "Camila",
	        "Enzo",
	        "Fernando",
	        "Maria",
	        "Alberto",
	        "Jonas",
	        "Junior",
	        "Paloma",
	        "Paulo"
	};
	
	String[] nomesResult = ordena(nomes,0 ,5, nomes.length);
	
	for (String nome : nomesResult) {
	    System.out.println(nome);
	}
    }

    private static String[] ordena(String[] nomes, int inicial, int miolo, int termino) {
	int total = termino - inicial;
	
	String[] result = new String[total];
	int atual = 0;
	int atual1 = inicial;
	int atual2 = miolo;
	
	while(atual1 < miolo && atual2 < termino) {
	    String nome1  = nomes[atual1];
	    String nome2 = nomes[atual2];
	    
	    if(nome1.compareTo(nome2) < 0) {
		result[atual] = nome1;
		atual1++;
	    } else {
		result[atual] = nome2;
		atual2++;
	    }
	    atual++;
	}
	
	 while(atual1 < miolo) {
	     result[atual] = nomes[atual1];
	    atual1++;
	    atual++;
	    }

	    while(atual2 < termino) {
		result[atual] = nomes[atual2];
	    atual2++;
	    atual++;
	    }
	    
	    for (int contador = 0; contador < atual; contador++) {
	        nomes[inicial + contador] = result[contador];
	    }
	
	return nomes;
    }

}
