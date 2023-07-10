/*
 * 3. Write a Java program to calculate the sum of all elements in an integer array?
 */

class Sum{
    public int sum(int[] arr){
        int n = arr.length;
        int res = 0;
        for(int i = 0; i<n; i++){
            res += arr[i];
        }
        return res;
    }
}

public class Launch3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Sum s = new Sum();
        
        System.out.println("The sum of all the array elements is - " + s.sum(arr));
    }
}
