// Rename file by Main.java
// Casting (Changing one type of data to other)

public class Main {

    public static void main(String[] args) {
        double price = 100.01;
        double finalprice = price+18;
        // here we can add or change int(4 byte) to double(8 byte)(decimal) 
        System.out.println("sum of double and int is : "+finalprice);
        
        //casting
        // But for converting/adding double to int we have to change it owrself
        int p = 100;
        int fp = p+(int)12.57;
        System.out.println("Sum of int and double : "+fp);
    }
}
