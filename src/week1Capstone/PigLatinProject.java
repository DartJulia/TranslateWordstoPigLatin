/*
 * @author: Julia Dart
 * Date created: 7/20/18
 * Version 1.0
 * 
 */
package week1Capstone;

import java.util.Scanner;

public class PigLatinProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// StringBuilder sb = new StringBuilder();

		System.out.println("Welcome to the pig latin translator!");

		String cont = "y";
		// continue until user indicates not to
		while (cont.equals("y")) {
			System.out.println("Please enter a word: ");
			String userWord = scan.nextLine();
			String userWord2 = userWord.toLowerCase();

			// first if statement checks if the first letter is a vowel, if so it accesses
			// the vowelFirst class
			if (userWord2.charAt(0) == 'a' || userWord2.charAt(0) == 'e' || userWord2.charAt(0) == 'i'
					|| userWord2.charAt(0) == 'o' || userWord2.charAt(0) == 'u') {
				System.out.println(vowelFirst(userWord2));
				// else statement accesses the consonant class
			} else {
				System.out.println(consonantFirst(userWord2));

			}

			System.out.println("Would you like to continue with another word? (y/n)");
			cont = scan.nextLine();
		}

		scan.close();

	}

	// vowelFirst method will take the original word and add "way" to the end,
	// returns a string value
	public static String vowelFirst(String userWord) {

		String finalWord = userWord.concat("way");

		return finalWord;

	}

	// consonantFirst method take the first vowel found and creates a substring from
	// that
	// index to the end of the length of the word;
	// it then gets another substring from the beginning of the word to the index
	// vowel(not including). concat method is used
	// to add substring 1 to substring 2 plus "ay" to finish the pig latin output.
	public static String consonantFirst(String userWord) {
		// StringBuilder sb = new StringBuilder();

		int wordLength = userWord.length();
		String vowels = "aeiou";
		String finalWord = "";
		String firstLetters = "";
		int i;
		for (i = 0; i < wordLength; i++) {
			if (vowels.contains(String.valueOf(userWord.charAt(i)))) {
				// int o = userWord.indexOf('o');
				// wordLength = userWord.length();
				finalWord = userWord.substring(i, wordLength);
				// System.out.println(finalWord);
				firstLetters = userWord.substring(0, i);
				// System.out.println(firstLetters);
				return finalWord.concat(firstLetters).concat("ay");
			}

		}
		return "";

	}

}
