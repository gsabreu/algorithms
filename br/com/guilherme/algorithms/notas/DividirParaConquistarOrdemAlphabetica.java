package br.com.guilherme.algorithms.notas;

public class DividirParaConquistarOrdemAlphabetica {

    public static void main(String[] args) {
	String[] nomes = { "Maria", "Camila", "Fernando", "Jonas", "Andressa", "Paloma", "Alberto", "Junior", "Enzo",
		"Paulo" };

	sort(nomes, 0, nomes.length);
	int position = busca(nomes, 0, nomes.length, "Paloma");
	
	if(position >= 0) {
	    System.out.println("Encontrado na posição " + position);
	} else {
	    System.out.println("Não encontrado");
	}

	for (int i = 0; i < nomes.length; i++) {
	    String nome = nomes[i];
	    System.out.println(nome);
	}
    }

    private static int busca(String[] nomes, int from, int to, String busca) {
	if(from > to) return -1;
	int middle  = (to + from) /2;
	String name = nomes[middle];
	if(busca.equalsIgnoreCase(name)) {
	    return middle;
	}
	if (busca.compareTo(name) < 0) {
	    return busca(nomes, from, middle -1, busca);
	}
	return busca(nomes, middle + 1, to, busca);
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
