// Rename file by Main.java
// Maths class min.max & Random
public class Main {
    public static void main(String[] agrs) {
        int a = 23;
        int b = 54;
        
        //Maximum
        System.out.println("Minimum if a & b is : "+Math.min(a,b));
        
        //Minimum
        System.out.println("Maximum if a & b is : "+Math.max(a,b));
        
        //Random
        // In double 0 to 1
        System.out.println("Random value from 0-1 is : "+Math.random());
        // In int 0 to 1oo
        System.out.println("Random value from 0-100 is : "+(int)(Math.random()*100));
    }
}
