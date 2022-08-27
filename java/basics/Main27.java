//Rename file by Main.java
// Write a program to guess correct random number
// Code 1
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        int rnd = (int)(Math.random()*100);
        // System.out.println(rnd);
        Scanner sc = new Scanner(System.in);
        while(true) {
            int inp = sc.nextInt();
            if(inp>rnd)
                System.out.println("Your input is greater");
            else if(inp<rnd)
                System.out.println("Your input is smaller");
            else if(inp == rnd) {
                System.out.println("Yeah! you guessed it correct");
                break;
            }
        }
    }
}


// code 2
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int rnd = (int)(Math.random()*100);
        int inp = 0;
        // System.out.println(rnd);
        System.out.println("Guess that number");
        do {
            inp = sc.nextInt();

            if(inp == rnd) {
                System.out.println("Yeah! you guessed it correct");
                break;
            }
            else if(inp > rnd) {
                System.out.println("You have entered larger number");
            }
            else {
                System.out.println("You have entered smaller number");
            } 
        } while(inp>0);

        System.out.println("My number was : ");
        System.out.println(rnd);
    }
}

