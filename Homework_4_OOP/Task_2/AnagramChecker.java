package Homework_4_OOP.Task_2;

import java.util.Scanner;
public class AnagramChecker {
/**
* Returns true if the two strings are anagrams of each other.
*/
    public static boolean isAnagram (String a, String b) {
        if (java.util.Arrays.equals(countLetters(a), countLetters(b))) {
            return true;
        }
        return false;
    }
/**
* Helper method to count how many times each letter (a-z) appears.
*/
    public static int [] countLetters (String s) {
        int [] counts = new int [26];
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'a':
                case 'A':
                    counts[0]++;
                    break;
                case 'b':
                case 'B':
                    counts[1]++;
                    break;
                case 'c':
                case 'C':
                    counts[2]++;
                    break;
                case 'd':
                case 'D':
                    counts[3]++;
                    break;
                case 'e':
                case 'E':
                    counts[4]++;
                    break;
                case 'f':
                case 'F':
                    counts[5]++;
                    break;
                case 'g': 
                case 'G':  
                    counts[6]++;
                    break;
                case 'h':
                case 'H':
                    counts[7]++;
                    break;
                case 'i':
                case 'I':
                    counts[8]++;
                    break;
                case 'j':
                case 'J':
                    counts[9]++;
                    break;
                case 'k':
                case 'K':
                    counts[10]++;
                    break;
                case 'l':
                case 'L':
                    counts[11]++;
                    break;
                case 'm':
                case 'M':
                    counts[12]++;
                    break;
                case 'n':
                case 'N':
                    counts[13]++;
                    break;
                case 'o':
                case 'O':
                    counts[14]++;
                    break;
                case 'p':
                case 'P':
                    counts[15]++;
                    break;
                case 'q':
                case 'Q':
                    counts[16]++;
                    break;
                case 'r':
                case 'R':
                    counts[17]++;
                    break;
                case 's':
                case 'S':
                    counts[18]++;
                    break;
                case 't':
                case 'T':   
                    counts[19]++;
                    break;
                case 'u':
                case 'U':
                    counts[20]++;
                    break;
                case 'v':
                case 'V':
                    counts[21]++;
                    break;
                case 'w':
                case 'W':
                    counts[22]++;
                    break;
                case 'x':
                case 'X':
                    counts[23]++;
                    break;
                case 'y':
                case 'Y':
                    counts[24]++;
                    break;
                case 'z':
                case 'Z':
                    counts[25]++;
                    break;
                default:
                    break;
            }
        }
        return counts;
    }
/**
* Print only letters that appear in the string with their counts.
*/
    public static void printLetterCounts (String s) {
        int [] counts = countLetters(s);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
    public static void main(String [] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get two strings from the user
            System.out.print (" Enter the first string: ");
            String word1 = scanner.nextLine ();
            System.out.print (" Enter the second string: ");
            String word2 = scanner.nextLine ();
            System.out.println (" Are they anagrams? " + isAnagram (word1 , word2 ));
            printLetterCounts (word1 );
        }
    }
}

