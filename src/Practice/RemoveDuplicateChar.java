package Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String result = removeDuplicate("gfgffjfj");
		System.out.println(result);
	}
	public static String removeDuplicate(String word) {
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : word.toCharArray()) {
			set.add(c);
		}
		for (char c : set) {
			sb.append(c);
		}
		return sb.toString();
	}
}
