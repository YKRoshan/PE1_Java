/*
*Program that accepts a word as input and checks for each single
* character letter in the word whether it is a consonant or vowel.
* */

import java.util.Scanner;

public class CheckVowelAndConsonant {
    public  String checkVowelAndConsonant(String str) {
        String s="";
        int l = str.length();
        for(int i = 0; i<l; i++) {
            if( !(( (str.charAt(i)>64) && (str.charAt(i)<91) ) ||
                    ( (str.charAt(i)>96) && (str.charAt(i)<123) )  ) ) {  /*If character is not a letter */
                //System.out.println("Error All are not letters.");
                return "Not a Valid Word";
            }
        }

        for(int i = 0; i<l; i++) {
            if((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o')
                    || (str.charAt(i)=='u')) {              /*If letter is vowel */
                s=s.concat(str.charAt(i)+" Vowel ");
            } else{                                          /*If letter is consonant */
                s=s.concat(str.charAt(i)+" Consonant ");
                //System.out.println(str.charAt(i)+" Consonant ");
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scanner.nextLine();
        CheckVowelAndConsonant obj = new CheckVowelAndConsonant();
        System.out.println(obj.checkVowelAndConsonant(str));
    }
}
