package Workshop3;

import java.util.Scanner;

public class NthEvenFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth Number: ");
        int Num = sc.nextInt();
        int first = 1;
        int second = 1;
        System.out.println(1);
        System.out.println(1);
        int sum = 0;
        for (int i = 1; i <= Num; i++) {
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;

        }
        System.out.println( "nth Even Fibonacci Number"  );
        for (int i = 1; i <= Num; i++){
            if(sum%2==0){
                System.out.println(sum);

            }
        }



    }
}
