package br.com.guilherme.algorithms.notas;

public class QuickSort {

    public static void main(String[] args) {
	Nota[] notas = { new Nota("andre", 4), new Nota("carlos", 8.5), new Nota("ana", 10), new Nota("paulo", 9),
		new Nota("jonas", 3), new Nota("juliana", 6.7), new Nota("lucia", 9.3), new Nota("mariana", 5),
		new Nota("gui", 7) };
	
	orderna(notas, 0 , notas.length);
	int posicao = busca(notas, 0, notas.length, 9.3);
	System.out.println("Encontrado na posição " + posicao);

	for (int i = 0; i < notas.length; i++) {
	    Nota nota = notas[i];
	    System.out.println(nota.getAluno() + " " + nota.getValor());
	}
    }

    private static int busca(Nota[] notas, int de, int ate, double buscando) {
	int meio = (de + ate) / 2;
	Nota nota = notas[meio];
	if(nota.getValor() == buscando) {
	    return meio;
	}
	else if(buscando < nota.getValor()) {
	    return busca(notas, de, meio -1, buscando);
	}
	return busca(notas, meio + 1, ate, buscando);
    }

    private static void orderna(Nota[] notas, int de, int ate) {
	int elementos = ate - de;
	if(elementos > 1) {
	    int posicaoDoPivo = particiona(notas, de, ate);
	    orderna(notas, de , posicaoDoPivo);
	    orderna(notas, posicaoDoPivo + 1, ate);
	}
	
	
	
    }
    
    
    private static int particiona(Nota[] notas, int inicial, int termino) {
	Nota pivo = notas[termino - 1];
	int menoresEncontrados = 0;
	for (int analisando = 0; analisando < termino - 1; analisando++) {
	    Nota atual = notas[analisando];
	    if (atual.getValor() <= pivo.getValor()) {
		troca(notas, analisando, menoresEncontrados);
		menoresEncontrados++;
	    }
	}
	troca(notas, termino - 1, menoresEncontrados);
	return menoresEncontrados;
    }

    private static void troca(Nota[] notas, int de, int para) {
	Nota nota1 = notas[de];
	Nota nota2 = notas[para];
	notas[para] = nota1;
	notas[de] = nota2;
    }
}
