package br.com.guilherme.algorithms.notas;

public class QuickSortOrdemAlphabetica {

    public static void main(String[] args) {
	String[] nomes = { "Maria", "Camila", "Fernando", "Jonas", "Andressa", "Paloma", "Alberto", "Junior", "Enzo",
		"Paulo" };

	sort(nomes, 0, nomes.length);
	
	for (int i = 0; i < nomes.length; i++) {
	    String nome= nomes[i];
	    System.out.println(nome);
	}
    }

    private static void sort(String[] nomes, int from, int to) {
	int elements = to - from;
	if (elements > 1) {
	    int pivotPosition = partition(nomes, from, to);
	    sort(nomes, from, pivotPosition);
	    sort(nomes, pivotPosition + 1, to);
	}

    }

    private static int partition(String[] nomes, int from, int to) {
	String pivo = nomes[to - 1];
	int menoresEncontrados = 0;
	for (int analisando = 0; analisando < to - 1; analisando++) {
	    String atual = nomes[analisando];
	    if (atual.compareTo(pivo) < 0) {
		troca(nomes, analisando, menoresEncontrados);
		menoresEncontrados++;
	    }
	}
	troca(nomes, to - 1, menoresEncontrados);
	return menoresEncontrados;
    }

    private static void troca(String[] nomes, int de, int para) {
	String nome1 = nomes[de];
	String nome2 = nomes[para];
	nomes[para] = nome1;
	nomes[de] = nome2;
    }

}
