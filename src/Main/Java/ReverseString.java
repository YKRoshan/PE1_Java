/*
*program to reverse any string without using String Buffer.
**/
import java.util.*;
import java.lang.*;

public class ReverseString {
    public String reverseString(String str1){
        String str2 = "";

        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }
        return str2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.next();
        ReverseString obj = new ReverseString();
        String str2=obj.reverseString(str1);

        System.out.println(str2);

    }
}
