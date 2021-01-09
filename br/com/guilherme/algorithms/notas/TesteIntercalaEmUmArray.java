package br.com.guilherme.algorithms.notas;

public class TesteIntercalaEmUmArray {

    public static void main(String[] args) {
	Nota[] notas = { new Nota("andre", 4), new Nota("mariana", 5), new Nota("carlos", 8.5), new Nota("paulo", 9),
		new Nota("jonas", 3), new Nota("juliana", 6.7), new Nota("gui", 7), new Nota("lucia", 9.3),
		new Nota("ana", 10) };

	Nota[] rank = intercala(notas, 0, 4, notas.length);

	for (Nota nota : rank) {
	    System.out.println(nota.getAluno() + ": " + nota.getValor());
	}
    }

    private static Nota[] intercala(Nota[] notas, int inical, int miolo, int termino) {
	Nota[] result = new Nota[termino - inical];

	int atual = 0;
	int atual1 = inical;
	int atual2 = miolo;

	while (atual1 < miolo && atual2 < termino) {

	    Nota nota1 = notas[atual1];
	    Nota nota2 = notas[atual2];

	    if (nota1.getValor() < nota2.getValor()) {
		result[atual] = nota1;
		atual1++;
	    } else {
		result[atual] = nota2;
		atual2++;
	    }
	    atual++;
	}

	while (atual1 < miolo) {
	    result[atual] = notas[atual1];
	    atual1++;
	    atual++;

	}

	while (atual2 < termino) {
	    result[atual] = notas[atual2];
	    atual2++;
	    atual++;
	}
	
	for (int i = 0; i < atual; i++) {
	    notas[inical + i]= result[i];
	}

	return notas;
    }

}
