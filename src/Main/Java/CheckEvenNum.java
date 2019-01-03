/*
* program which accepts a number as input from user and perform the following:
* a. sort the number in non-increasing order
* b. after sorting sum all the even numbers, the sum should be greater than 15 .
* c. if sum is more than 15,then print output as true or false.
* */
import java.util.Scanner;

public class CheckEvenNum {
    public int len=0;

    public  int[] sort(int n) {
        int[] arr = new int[20];
        int s, i;
        for (i = 0; n > 0; n = n / 10, i++) {
            s = n % 10;
            arr[i] = s;
        }

        for (int k = 0; k < i - 1; k++) {
            for (int j = 0; j < i - k - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        len=i;
        return arr;
    }

    public boolean sumOfEvenNum(int arr[],int i) {
        System.out.println();
        int sum = 0;
        for (int k = 0; k < i; k++) {
            if (arr[k] % 2 == 0)
                sum += arr[k];
        }
        System.out.println("Sum of even numbers : " + sum);
        if (sum > 15) {                 /*If sum is greater than 15*/
            return true;
        } else {                      /*If sum is less than 15*/
            return  false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        CheckEvenNum obj= new CheckEvenNum();
        int []arr=obj.sort(n);
        int length;
        length=obj.len;
        for(int i=0;i<length;i++) {
            System.out.print(arr[i]);
        }

        System.out.println(obj.sumOfEvenNum(arr,length));
    }
}
