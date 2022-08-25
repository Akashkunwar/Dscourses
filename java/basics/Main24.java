// Rename file by Main.java
// Break and Continue

public class Main {
    public static void main(String[] agrs) {
        // Break
        int i = 0;
        while(true) {
            // Continue skips if condition become true and run next
            if(i==3) {
                i=i+1;
                continue;
            }
            System.out.println(i);
            // Break stop exesution in while if cindition become true
            i=i+1;
            if(i>5) {
                break;
            }
        }
    }
}