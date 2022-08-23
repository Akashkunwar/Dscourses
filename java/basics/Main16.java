// Rename file by Main.java
// Input fundtion

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        // Input
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.println("Input your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is : "+age);

        // float input
        System.out.println("Input your weight : ");
        float weight = sc.nextFloat();
        System.out.println("Your age is : "+weight);

        // // Any input can be done by replacing type like long, bool, byte, etc
        // System.out.println("Input your age : ");
        // xyz age = sc.nextXyz();
        // System.out.println("Your age is : "+age);

        // String input
        System.out.println("Input your Name : ");
        String name = sc.next();
        System.out.println("Your name is : "+name);

        // Line of string input
        // This work alone without input string
        System.out.println("Input your line : ");
        String line = sc.nextLine();
        System.out.println("Your age is : "+line);

        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your age is : "+weight);

    }
}
