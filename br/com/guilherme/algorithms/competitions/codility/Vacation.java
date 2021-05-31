package br.com.guilherme.algorithms.competitions.codility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Vacation {
    public static void main(String[] args) throws ParseException {
	int Y = 2014;
	String A = "April";
	String B = "May";
	String W = "Wednesday";
	System.out.println(solution(Y, A, B, W));
    }

    public static int solution(int Y, String A, String B, String W) throws ParseException {
	List<String> days = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

	List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
		"September", "October", "November", "December");
	List<Integer> monthLenght = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

	int month = 0;
	for (int i = 0; i < months.size(); i++) {
	    if (months.get(i).equals(A))
		month = i + 1;
	}
	String stringDate = "01-" + String.valueOf(month) + "-" + String.valueOf(Y);
	DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy");
	Date date = dateFormat.parse(stringDate);
	Calendar c = Calendar.getInstance();
	c.setTime(date);
	String dayWeekText = new SimpleDateFormat("EEEE").format(date);
	return 1;

    }

}
