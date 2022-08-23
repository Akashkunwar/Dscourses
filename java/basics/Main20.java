// Rename file by Main.java
// Conditional Statement  with Logical operators 
// More than 2 conditional operator

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        // Logical operators
        // Conditional statement
        Scanner sc = new Scanner(System.in);

        // pen = 10, notebool = 40
        int cash = sc.nextInt();
        if(cash<10) {
            System.out.println("Can't get anything");
            System.out.println("get more cash");

        }
        else if(cash>=10 && cash<50)
            System.out.println("You can get only one thong");
        else
            System.out.println("You can get both");
    }
}