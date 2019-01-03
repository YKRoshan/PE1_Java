/*
* program using a loop to print the following output.
* 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . .
* nth iteration.
* */
import java.util.Scanner;

public class Pattern {
    public String printPattern(int n){
        String str="";
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                str=str.concat(i+" ");
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        Pattern obj = new Pattern();

        System.out.println(obj.printPattern(n));
    }
}
