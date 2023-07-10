/*
    1. Write a program to demonstrate method overloading with 3 different parameters
 */

class OverloadingExample{
    public int add(int a, int b){
        int res = a + b;
        return res;
    }
    //Method overloading
    public float add(int x, float y){
        float res = x + y;
        return res;
    }
    //Method overloading
    public double add(double m, double n, double o){
        double res = m + n + o;
        return res;
    }
}

public class Launch1{
    public static void main(String[] args){
        OverloadingExample ol = new OverloadingExample();

        System.out.println("Example of Method Overloading!");
        System.out.println("The values int and int = " + ol.add(4, 7));
        System.out.println("The values int and float = " + ol.add(6, 10.5f));
        System.out.println("The values double, double and double = " + ol.add(12.3,54.3,56.9));

    }
}