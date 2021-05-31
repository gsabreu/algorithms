package br.com.guilherme.algorithms.competitions.codility;

import java.util.Arrays;
import java.util.List;

public class agenda {

    public static void main(String[] args) {
	String[] A = {"sander", "amy", "ann", "michael"};
	String[] B = { "123456789", "234567890", "789123456", "123123123"};
	String P = "1";
	System.out.println(solution(A, B, P));
    }

    public static String solution(String[] A, String[] B, String P) {
	List<String> names = Arrays.asList(A);
        List<String> numbers = Arrays.asList(B);

        String contact = "NO CONTACT";

        for (int i = 0; i < numbers.size(); i++) {
            String number = numbers.get(i);
            if (number.indexOf(P) != -1) {
        	String actualContact = names.get(i);
                if(contact == "NO CONTACT" || actualContact.compareTo(contact) < 0) {
                    contact = actualContact;
                }
            }
        }
        return contact;
    }

}
