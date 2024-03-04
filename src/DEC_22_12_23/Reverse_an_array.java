package DEC_22_12_23;

public class Reverse_an_array {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" "+  arr2[i]);
        }
    }
}
