package br.com.guilherme.algorithms.produto;

public class TestSorts {

    public static void main(String[] args) {

	Produto produtos[] = { new Produto("Lamborghini", 1000000.00), new Produto("Jipe", 46000.00),
		new Produto("Brasília", 16000.00), new Produto("Smart", 46000.00), new Produto("Fusca", 17000.00) };

//	selectionSort(produtos, produtos.length);
	insertionSort(produtos, produtos.length);

	for (Produto produto : produtos) {
	    System.out.println(produto.getNome() + " custa " + produto.getPreco());
	}

    }

    //nˆ2
    private static void insertionSort(Produto[] produtos, int quantidadeElementos) {
	for (int atual = 1; atual < quantidadeElementos; atual++) {

	    int analise = atual;

	    while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
		changeProducts(produtos, analise, analise - 1);
		analise--;
	    }
	}
	System.out.println(produtos);
    }

    //2*n^2
    private static void selectionSort(Produto[] produtos, int quantidadeElementos) {
	for (int atual = 0; atual < quantidadeElementos; atual++) {
	    int menor = buscaMenor(produtos, atual);
	    
	    changeProducts(produtos, atual, menor);
	}
    }
    
    private static void changeProducts(Produto[] produtos, int primeiro, int segundo) {
  	Produto primeiroProduto = produtos[primeiro];
  	Produto segundoProduto = produtos[segundo];

  	produtos[primeiro] = segundoProduto;
  	produtos[segundo] = primeiroProduto;

      }


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
