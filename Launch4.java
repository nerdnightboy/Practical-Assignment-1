/*
 * 4. Write a Java program to find the index of a specific element in an integer array.?
 */

class Index{
    public int specificIndex(int[] arr, int elm){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == elm){
                return i;
            }
        }
        return -1;
    }
}

public class Launch4 {
    public static void main(String[] args) {
        int[] arr = {1, 54, 84, 8, 4, 87, 98, 15, 65, 68, 45, 10};
        int specific = 98;
        Index in = new Index();

        System.out.println("The specific element's index is = " + in.specificIndex(arr, specific)); //it will return the index of specific element, if no element found in array it will return -1.
    }
}
