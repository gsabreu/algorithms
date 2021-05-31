package br.com.guilherme.algorithms.competitions.codility;

public class FormatNumber {
    
    public static void main(String[] args) {
   	String number = "00-44   48 5555 8361";
   	System.out.println(solution(number));
       }
    
    public static String solution(String S) {
	String dash = "-";
	S = S.replaceAll(" ", "");
	S = S.replaceAll(dash, "");
	
	
	StringBuilder number = new StringBuilder(S); 
	if (S.length() == 14) {
	    number.insert(3, dash);
	    number.insert(7, dash);
	    number.insert(11, dash);
	    number.insert(15, dash);
	    return number.toString();
	    
	}
	else if (S.length() == 10) {
	    number.insert(3, dash);
	    number.insert(7, dash);
	    number.insert(10, dash);
	    return number.toString();
	}
	else if (S.length() == 9) {
	    number.insert(3, dash);
	    number.insert(7, dash);
	    return number.toString();
	}
	return number.toString();
    }

}
