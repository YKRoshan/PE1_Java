/*
* Program that takes a character from the user as input and determines whether
 * the character entered is a capital letter, a small case letter, a digit or
  * a special symbol and display appropriately.
* */
import java.util.Scanner;

public class CheckCharacter {
    public String checkCharacter(char ch){
        if( (ch>64) && (ch<91) ){             /*If character is capital letter*/
           return "Capital Letter";
        } else if ( (ch>96) && (ch<122) ){    /*If character is small letter*/
            return "Small Letter";
        } else if ( (ch>47) && (ch<58) ){      /*If character is number*/
           return "Number";
        }
        else{                                  /*If character is special symbol*/
           return "Special Symbol";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        CheckCharacter obj = new CheckCharacter();
        System.out.println(obj.checkCharacter(ch));

    }
}
