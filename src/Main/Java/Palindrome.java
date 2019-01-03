/*
* program which accepts a number as input and check
* whether the given number is palindrome or not.
* If it is a palindrome then
* a. Add all the even numbers and check whether the sum is more than 25.
8 b. Print success and failure messages for all 3 conditions.
 */

import java.util.Scanner;

public class Palindrome {
    public  boolean palindrome(long n) {
        long s;  /*Sum variable */
        long num=n;
        for(s=0;n>0;n=n/10) {
            s=s*10;
            s=s+n%10;
        }
        if(s==num){
            return true; /*If reversed number is equal to original number*/
        } else{
            return false; /*If reversed number is not equal to original number*/
        }

    }

    public  long evenNumberSum(long n) {
        long s; /*Sum variable */
        for(s=0;n>0;n=n/10) {
            long num=n%10;
            if(num%2==0) {  /*If number is even */
                s+=num;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = scanner.nextLong();
        Palindrome obj = new Palindrome();
        if(obj.palindrome(n)) {  /*If number is palindrome */
            long evenNumSum = obj.evenNumberSum(n);

            if(evenNumSum>25) { /*If  sum of even numbers is greater than 25 */
                System.out.println(n + " is palindrome and the sum of even numbers is greater than 25.");
            } else{ /*If  sum of even numbers is less than 25 */
                System.out.println(n + " is palindrome and the sum of even numbers is less than 25.");
            }
        }
        else{  /*If number is not palindrome */
            System.out.println(n + " is not palindrome.");
        }

    }
}
