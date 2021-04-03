package br.com.guilherme.algorithms.competitions.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * 
 * This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 *
 */

public class demo {
    public static void main(String[] args) {
	int[] a = { 1, 3, 6, 4, 1, 2 };
	System.out.println(solution(a));
    }

    public static int solution(int[] A) {

	Set<Integer> setA = new HashSet<Integer>(Arrays.stream(A).boxed().collect(Collectors.toList()));
	List<Integer> list = new ArrayList(setA);

	if (list.get(0) < 0 && list.get(list.size() - 1) < 0) {
	    return 1;
	}
	
	int smallest = 0;
	
	for (int i = list.size() -1; i > 0; i--) {
	    if (smallest == 0) smallest = list.get(i) + 1;
	    if (list.get(i) - list.get(i-1) != 1) {
		smallest = list.get(i-1) +1;
	    }
	}
	
	return smallest;

    }

}
