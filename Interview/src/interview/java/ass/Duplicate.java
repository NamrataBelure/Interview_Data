package interview.java.ass;

import java.util.Scanner;

public class Duplicate {

	private static final String letters = null;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] data ={"acb","aabca","aasects"};
		for (String str : data) {
			System.out.printf("\n Input:%s ",str,removeDuplicates(str));
			
		}
		 System.out.println("\n\n Calling removeDuplicatesFromString(String str).");
	        for (String input : data) {
	            System.out.printf("Input : %s  Output: %s %n",
	                  input,removeDuplicatesFromString(input));
	        }

	}

	private static Object removeDuplicatesFromString(String input) {
		 if (input == null || input.length()<2) {
	            return input;
	        }

	        boolean[] ASCII = new boolean[256];
	        char[] characters = input.toCharArray();
	        ASCII[input.charAt(0)] = true;

	        int dupIndex = 1;
	        for (int i = 1; i< input.length(); i++) {
	            if (!ASCII[input.charAt(i)]) {
	                characters[dupIndex] = characters[i];
	                ++dupIndex;
	                ASCII[characters[i]] = true;

	            } else {
	                characters[dupIndex] = 0;
	                ++dupIndex;
	            }
	        }

	        return toUniqueString(characters);
	}

	private static Object toUniqueString(char[] characters) {
		 StringBuffer sb = new StringBuffer(characters.length);
	        for (char c : characters) {
	            if (c != 0) {
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	    }
	private static Object removeDuplicates(String str) {
		if (str == null || str.length() < 2) {
            return str;
        }

        int pos = 1; // possible position of duplicate character
        char[] characters = str.toCharArray();

        for (int i = 1; i < str.length(); i++) {
            int j;
            for (j = 0; j < pos; ++j) {
                if (characters[i] == characters[j]) {
                    break;
                }
            }
            if (j == pos) {
                characters[pos] = characters[i];
                ++pos;
            } else {
                characters[pos] = 0;
                ++pos;
            }
        }
		return null;
	}

}
