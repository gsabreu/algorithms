package br.com.guilherme.algorithms.produto;

public class TestaOrdernacao {
    
    public static void main(String[] args) {
	
	Produto produtos[] = {
        	new Produto("Lamborghini", 1000000.00),
        	new Produto("Jipe", 46000.00),
        	new Produto("Brasília", 16000.00),
        	new Produto("Smart", 46000.00),
        	new Produto("Fusca", 17000.00)
	};
	
	ordernar(produtos, produtos.length);
	
	for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
	
    }
    
   private static void ordernar(Produto[] produtos, int quantidadeElementos) {
       for (int atual = 0; atual < produtos.length; atual++) {
	    int menor = buscaMenor(produtos, atual);
	    
	    Produto produtoAtual = produtos[atual];
	    Produto produtoMenor = produtos[menor];
	    
	    produtos[atual] = produtoMenor;
	    produtos[menor] = produtoAtual;
	}
    }
    
    
    private static int buscaMenor(Produto[] produtos, int inicio) {
   	int maisBarato = inicio;
   	
   	for (int atual = inicio; atual < produtos.length; atual++) {
   	    if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
   		maisBarato = atual;
   	    }
   	}
   	
   	return maisBarato;
   	
       }

}
