// Rename file by Main.java
// do while loop example
// It prints user input untill user gives -ve number

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        // do while example
        Scanner sc = new Scanner(System.in);
        int number = 0; // can't initiate inside loop

        do{
            System.out.print("Input a number : ");
            number = sc.nextInt();
            System.out.print("You entered number: ");
            System.out.println(number);
        } while(number >=0);

        System.out.println("THE END");
    }
}
