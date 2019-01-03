/*
*Program that reads an unspecified number of integer
*arguments using Scanner Class and adds them together.
*/
import java.util.Scanner;
import java.lang.*;

public class CalculateSumOfNumbers {
    public int calculateSum(String s){
        int sum = 0;
        String [] numbers = s.split(" ");
        int i=0;
        while (i<numbers.length) {
            sum +=Integer.parseInt(numbers[i]);
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String s=scanner.nextLine();
        CalculateSumOfNumbers obj = new CalculateSumOfNumbers();
        System.out.println("Sum = " + obj.calculateSum(s));
    }
}
