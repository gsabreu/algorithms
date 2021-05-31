package test;

import java.util.Arrays;
import java.util.List;

public class algotest {
    
    public static void main(String[] args) {
	    Integer n = 100;
	    getPairResult(Arrays.asList(), n);
	   
    }
    
    private static void getPairResult(List<Integer> num, int n ) {
	// [1, 3, 4, 0] = 4
	Integer listSize = num.size();
	for (int i = 0; i < listSize; i++) {
	    for (int j = i + 1; j < listSize ; j++) {
		Integer num1= num.get(i);
		Integer num2 = num.get(j);
		
		if(num1 + num2 == n) {
		    System.out.println(num1.toString() + "+" + num2);
		}
		    
	    }
	    
	}
	
    }

}

/// getPairResultTest_whenPassEmptyArray
// negative numbers in array or in integer n
// 
