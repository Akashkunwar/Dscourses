// Rename file by Main.java
// TRY  - CATCH for exception handling

public class Main {
    public static void main(String[] agrs) {
        // TRY  - CATCH for exception handling
        int[] marks = {21,34,23,24};
        System.out.println(marks[3]);
        try {
            System.out.println(marks[4]);// error bcz marks[4] not in array
        }catch(Exception exception) {
            // Do something after catching error
            System.out.println("Error Handaled!");
        }
        System.out.println("Code complitly run");

    }
 }