/*
 * 2. Write a program to create an object of an class which contain a method and call that class method in
main method.
 */

class CallingMethod{
    void call(){
        System.out.println("Method Call is Running.");
    }
}

public class Launch2 {
    public static void main(String[] args) {
        CallingMethod cm = new CallingMethod();

        cm.call(); //Method call through object cm
    }
}
