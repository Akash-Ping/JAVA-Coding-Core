package DEC_22_12_23;

public class Max_of_Array {

    // find max of array
    public static void main(String[] args) {
        // program to use array
        int arr[] = {10, 20, 30, 40, 50};
        int max = arr[0];
        for(int i = 0;i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
