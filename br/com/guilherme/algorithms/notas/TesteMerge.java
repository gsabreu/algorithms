package br.com.guilherme.algorithms.notas;

public class TesteMerge {
    
    public static void main(String[] args) {
	Nota[] notasMauricio = {
		new Nota("andre", 4),
		new Nota("mariana", 5),
		new Nota("carlos", 8.5),
		new Nota("paulo", 9)
	};
	
	
	Nota[] notasAlberto = {
		new Nota("jonas", 3),
		new Nota("juliana", 6.7),
		new Nota("gui", 7),
		new Nota("lucia", 9.3),
		new Nota("ana", 10),
	};
	
	Nota[] rank = mergeSort(notasMauricio, notasAlberto);
	
	for (Nota nota : rank) {
	    System.out.println(nota.getAluno() + ": " + nota.getValor());
	}
	
    }

    private static Nota[] mergeSort(Nota[] notas1, Nota[] notas2) {
	int total  = notas2.length + notas1.length;
	Nota[] result = new Nota[total];
	
	int atual1 = 0;
	int atual2 = 0;
	int atual = 0;
	
	while(atual1 < notas1.length && atual2 < notas2.length) {
	    
	    Nota nota1 = notas1[atual1];
	    Nota nota2 = notas2[atual2];
	    
	    if(nota1.getValor() < nota2.getValor()) {
		result[atual] = nota1;
		atual1++;
	    } else {
		result[atual] = nota2;
		atual2++;
	    }
	    atual++;
	}
	
	while(atual1 < notas1.length) {
	    result[atual++] = notas1[atual1++];
	    atual++;
	    atual1++;
	}
	
	while(atual2 < notas2.length) {
	    result[atual] = notas2[atual2];
	    atual++;
	    atual2++;
	}
		
	return result;
    }

}
