package br.com.guilherme.algorithms.competitions.produtoinvalido;

import java.util.ArrayList;
import java.util.List;

public class ProdutosInvalidos {

    public static void main(String[] args) {

	List<String> requestProducts = new ArrayList<>();
	List<String> activeProducts = new ArrayList<>();

	getInactiveProducts(requestProducts, activeProducts);
    }

    private static List<String> getInactiveProducts(List<String> requestProducts, List<String> activeProducts) {

	List<String> inactiveProducts = new ArrayList<>();

	activeProducts.sort((p1, p2) -> {
	    return p1.compareTo(p2);
	});

	if (requestProducts.size() == activeProducts.size()) {
	    return inactiveProducts;
	}
	return findInactiveProducts(activeProducts, requestProducts);
    }

    private static List<String> findInactiveProducts(List<String> activeProducts, List<String> requestProducts) {
	List<String> inactiveProducts = new ArrayList<>();
	
	for (String requestProduct : requestProducts) {
	    String inactiveProduct = bynarySearch(activeProducts, 0 , activeProducts.size(), requestProduct);
	    if(!inactiveProduct.isEmpty()) {
		inactiveProducts.add(inactiveProduct);
	    }
	}
	return inactiveProducts;
    }

    private static String bynarySearch(List<String> activeProducts, int first, int last, String requestProduct) {
	
	if(first > last) return requestProduct;
	
	int middle = (last + first) / 2;
	String activeProduct = activeProducts.get(middle);
	
	if(requestProduct.equalsIgnoreCase(activeProduct)) {
	    return "";
	}
	
	if(requestProduct.compareTo(activeProduct) < 0) {
	    return bynarySearch(activeProducts, first, middle - 1, requestProduct);
	}
	
	return bynarySearch(activeProducts, middle + 1, last, requestProduct);
    }

}
