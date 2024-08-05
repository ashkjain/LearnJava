
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        // These are the two ways to declare arrays
        int[] arr;
        int arr2[];

        // In this example we are fixing the size of the array
        arr = new int[10];

        // This is the method to check the length of the array
        System.out.println(arr.length);

        /* This is printing out the first index value of the array,
         but we did not put any value in the array yet,
          but in Java each datatype has its own default value */
        System.out.println(arr[0]);

        // In this example we are declaring the array and at the same time we are declaring its size as well.
        double[] arr3 = new double[10];

        // Printing the value at the position or index 1
        System.out.println(arr3[0]);

        /* Here we decalre the boolean values array and printed to the console,
         but the second print statement will cause an error,
          because the index of the array is only 9(10) but since index starts from zero,
           last index should be 9, so it would return in an error.boolean*/
        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);
//        System.out.println(arr4[10]);

        // If we know the values or the literals we can pass in the value like this
        int[] arr5 = {3, 2, 1};

        // This is an example of multi-dimensional array. Then we are from the first array and the last value
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(matrix[0][2]);

        // If the anrray inside the array is not defined the value will be given null.
        // But if the size is provided, it will return a alphanumeric value
        int[][] matrix2 = new int[10][];
        System.out.println(matrix2[0]);

        //To print array to the console there is a method with Array class that can be used.
        // Make sure to import that class at the top of the document
        // Which is java.util.Arrays
        System.out.println(Arrays.toString(arr5));
        // We can also sort the array
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
    }
}
