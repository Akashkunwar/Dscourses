// Rename file by Main.java
// Conditional Statement  - SWITCH
// It prints all statement from true value
public class Main {
    public static void main(String[] agrs) {
        // Logical operators
        // Conditional statement - SWITCH
        int day = 5; // 1 - monday, 2 - tuesday,...
        switch(day) {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thrusday");
                break;
            case 5 :
                System.out.println("friday");
            default :
                System.out.println("Holiday");
        }

    }
}