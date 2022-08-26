// Rename file by Main.java
// Creating methords/functions

public class Main {
    // Creating methods
    // method 1
    public static void printJava() {
         System.out.println("Hello java");
    }

    // method 2
    public static void printName(String name) {
        System.out.println("Hello "+name+"! How are you?");
    }

    // method 3
    public static void printSum(int a, int b) {
        int sum = a+b;
        System.out.println(+a+" + "+b+" = "+sum);
    }
    public static void main(String[] agrs) {
        // calling method 1
        printJava();
        printJava();
        printJava();
        
        // calling method 2
        printName("Akash");
        printName("Kunwar");

        // calling method 3
        printSum(3,5);
    }
}