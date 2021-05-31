package test;

import java.util.Arrays;

import com.sun.xml.internal.ws.util.StringUtils;

public class AnagramTest {

    public static void main(String[] args) {
	System.out.println(isAnagram("123", "321")); // positive test
	System.out.println(isAnagram("432", "123")); // negative
	System.out.println(isAnagram("ABC", "abc")); // negative
	System.out.println(isAnagram("", "abc")); // negative
	System.out.println(isAnagram("123", "1123")); // negative
	System.out.println(isAnagram("1123", "1223")); // negative
	System.out.println(isAnagram("", "")); // true
	System.out.println(isAnagram(null, null)); // negative

    }

    private static boolean isAnagram(String s1, String s2) {
	boolean isAnagram = false;
	
	if (s1 == null || s2 == null) {
	    return isAnagram;
	}

	
	char[] s1Chars = s1.toCharArray();
	char[] s2Chars = s2.toCharArray();

	Arrays.sort(s1Chars);
	Arrays.sort(s2Chars);

	String s1Result = new String(s1Chars);
	String s2Result = new String(s2Chars);

	return s1Result.equals(s2Result);

    }

}
