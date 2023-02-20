package Workshop3;

public class CountofSmallerElement {
    public static void main(String[] args) {

        int[] arr = {56, 98, 76, 43, 99, 78};
        int temp;
        int count;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
            System.out.println(count);

        }
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println(arr[0]);
    }




}
