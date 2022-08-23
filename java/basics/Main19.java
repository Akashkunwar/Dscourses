// Rename file by Main.java
// Logical operators with Conditional Statement 

public class Main {
    public static void main(String[] agrs) {
        // Logical operators
        // && (if coth condition are correct)
        // || (if any of the condition is correct)
        // ! (if that statement is not correct)

        int a = 25;
        int b = 75;
        // && (if coth condition are correct)
        if(a<50 && b<50)
            System.out.println("&& = Both are less than 50");
        else
            System.out.println("&& = Statement is wrong");

        // || (if any of the condition is correct)
        if(a<50 || b<50)
            System.out.println("|| = Atleast one is less than 50");
        else
            System.out.println("|| = Statement is wrong");
        
        // ! (if not)
        //without
        boolean isadult = false;
        if(isadult)
            System.out.println("is adult");
        else
            System.out.println("not adult");
        
        //with
        if(!isadult)
            System.out.println("! = is adult");
        else
            System.out.println("! = not adult");
        
    }
}