/*
* program for the following condition:
* Given 2 inputs , where input1 is string and input 2 is
* integer value, the last n characters should repeat n number
* of times in the output String.
* */
import java.util.Scanner;


public class PrintString {

    public String printString(String str,int n){
        int len = str.length();
        String result="";
        String ss = str.substring((len-n));
        result+=str;
        for(int i=0;i<n;i++) {
            result+=ss;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        PrintString obj  = new PrintString();
        str=obj.printString(str,n);
        System.out.println(str);
    }
}
