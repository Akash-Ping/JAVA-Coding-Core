package DEC_22_12_23;

public class Sum_of_Array {
    public static void main(String[] args) {
        // program to use array
        // int ar[] = new int[5];
//        int ar[] = {10, 20, 30, 40, 50};
//        int sum = 0;
//        for(int i = 0;i<ar.length; i++) {
//            sum = sum + ar[i];
//        }
//        System.out.println("sum = " + sum);

        // int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];

        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0;i<arr.length; i++) {
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("sum = " + sum);
    }
}
