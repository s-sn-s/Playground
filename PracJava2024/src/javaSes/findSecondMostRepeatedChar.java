package javaSes;
import java.util.HashMap;
import java.util.Map;

public class findSecondMostRepeatedChar {

	public static char findSecondMostFrequentChar(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (char c : str.toCharArray()) {
			charCountMap.put(c,charCountMap.getOrDefault(c, 0) + 1);}

		char firstMostFrequent = ' ';
		char secondMostFrequent = ' ';
		int firstMaxCount = 0;
		int secondMaxCount = 0;

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			char currentChar = entry.getKey();
			int currentCount = entry.getValue();
			System.out.print(currentChar + " - ");
			System.out.println(currentCount);
			if (currentCount > firstMaxCount) {
				secondMaxCount = firstMaxCount;
				secondMostFrequent = firstMostFrequent;

				firstMaxCount = currentCount;
				firstMostFrequent = currentChar;
				System.out.println(firstMostFrequent);
				System.out.println(secondMostFrequent);
			} else if (currentCount > secondMaxCount && currentCount != firstMaxCount) {
				secondMaxCount = currentCount;
				secondMostFrequent = currentChar;
			}
		}

		return secondMostFrequent;
	}

	public static void main(String[] args) {
		String str = "testteam";
		char secondMostFrequentChar = findSecondMostFrequentChar(str);
		System.out.println("Second most frequent character: " + secondMostFrequentChar);
	}
}
