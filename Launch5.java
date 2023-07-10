/*
 * 5. Write a Java program to print an entire array?
 */

class PrintArray{
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


public class Launch5{
    public static void main(String[] args){
        int []arr = {1,2,3,4,5,6,7,8,9,0};

        PrintArray print = new PrintArray();

        print.printArray(arr);
    }
}