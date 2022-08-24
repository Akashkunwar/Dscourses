// Rename file by Main.java
// Loops(for, while & do while loop)

public class Main {
    public static void main(String[] args) {
        // LOOPS
        // For loop
        System.out.println("For loop starts here : ");
        for(int i = 8; i>=1; i = i-1) {
            System.out.println(i);
        }

        //while loop
        // It runs loop until statement become true
        System.out.println("While loop starts here : ");
        int j = 5;
        while(j>=1) {
            System.out.println(j);
            j = j-1;
        }

        //Do While loop 
        // It run statement and check wether statement is true
        System.out.println("Do While loop starts here : ");
        int k = 6;
        do {
            System.out.println(k);
            k = k+1;
        } while(k<=10);
    }
}
