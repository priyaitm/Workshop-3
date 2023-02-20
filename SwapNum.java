package Workshop3;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first Number:");
        int first_num = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int sec_num = sc.nextInt();
        System.out.println("Before Swapping first num: " +first_num);
        System.out.println("Before Swapping second num: " +sec_num);

        int temp;
        temp=first_num;
        first_num=sec_num;
        sec_num=temp;

        System.out.println("After Swapping first num: " +first_num);
        System.out.println("After Swapping second num: " +sec_num);
    }

}
