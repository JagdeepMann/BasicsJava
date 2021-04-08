import java.util.ArrayList;
import java.util.Arrays;

public class Basics {

    public void printNums() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // Print odd numbers between 1-255
    // Write a method that prints all the odd numbers from 1 to 255.
    public void oddNums() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New Number: " + i + "  Sum: " + sum);
        }
    }

    public void iterateArray() {
        int[] arr = { 1, 3, 5, 7, 9 };
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    // Find Max
    // Write a method (sets of instructions) that takes any array and prints the
    // maximum value in the array. Your method should also work with a given array
    // that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive
    // numbers, negative numbers and zero.
    public void findMax() {
        int[] arr = {-3, -5, -7, 0};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    //     Get Average
    // Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void getAvg(){
        int[] arr = { 1, 2, 3, 4,21 };
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum/arr.length);
    }

    //     Array with Odd Numbers
    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public void arrOddNums(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <=255; i++){
            if(i%2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    //     Greater Than Y
    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public void greaterThanY(int[] arr, int y){

        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>y){
                temp++;
            }
        }
        System.out.println(temp);
    }

    //     Square the values
    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public void squareVals(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    //     Eliminate Negative Numbers
    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public void eliminateNegNums(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //     Max, Min, and Average
    // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public void maxMinAvg(int[] arr){
        int max = arr[0];
        int min = arr[0];
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        double[] newArr = {max, min, avg};
        System.out.println(Arrays.toString(newArr));
    }

    //     Shifting the Values in the Array
    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    public void shiftVal(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }

}


