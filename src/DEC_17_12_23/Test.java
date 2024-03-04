package DEC_17_12_23;

public class Test {
    public static void main(String[] args) {
        // program to use array
        int arr[] = {10, 20, 30, 40, 50};
        for(int i = 0;i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------");
        for(int a : arr) {
            System.out.println(a);
        }
        System.out.println("----------------------------");
        System.out.println("length of array = " + arr.length);
    }
}
