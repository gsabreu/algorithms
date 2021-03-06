package br.com.guilherme.algorithms.produto;

public class TesteMinor {

    public static void main(String[] args) {

	Produto produtos[] = { new Produto("Lamborghini", 1000000.00), new Produto("Jipe", 46000.00),
		new Produto("Brasília", 16000.00), new Produto("Smart", 46000.00), new Produto("Fusca", 17000.00) };

	int maisBarato = 0;

	maisBarato = buscaMenor(produtos, maisBarato);

	System.out.println(maisBarato);
	System.out.println("O carro " + produtos[maisBarato].getNome() + " é o mais barato e  custa "
		+ produtos[maisBarato].getPreco());
    }

    //2N
    private static int buscaMenor(Produto[] produtos, int inicio) {
	int maisBarato = inicio;

	for (int atual = inicio; atual < produtos.length; atual++) {
	    if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
		maisBarato = atual;
	    }
	}

	return maisBarato;

    }

}
