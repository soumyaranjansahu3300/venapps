 package Logical;

import java.util.ArrayList;
import java.util.List;

public class CheckStringOrNumber {

	public static void main(String[] args) {

		String sampleText = "Balaram1234";

		char[] charArray = sampleText.toCharArray();
		List<Character> listWithNumber = new ArrayList<Character>();
		System.out.println(listWithNumber  );
		List<Character> listWithAlphabet = new ArrayList<Character>();

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isDigit(charArray[i]))
				listWithNumber.add(charArray[i]);
			if (Character.isLetter(charArray[i]))
				listWithAlphabet.add(charArray[i]);

		}
		StringBuilder sb = new StringBuilder();
		// StringBuilder sbWithNumbers = new StringBuilder();

		StringBuilder sbWithNumbers = convertToStringBuilder(sb, listWithNumber);
		sb = new StringBuilder();
		StringBuilder sbWithAlphabets = convertToStringBuilder(sb, listWithAlphabet);
		System.out.println("Alphabets : " + sbWithAlphabets);
		System.out.println("Numbers : " + sbWithNumbers);
	}

	private static StringBuilder convertToStringBuilder(StringBuilder sb, List<Character> list) {
       System.out.println(list);
		list.forEach(item -> {
			sb.append(item);
		});

		return sb;

	}
}
