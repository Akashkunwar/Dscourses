// Rename file by Main.java
// operators
public class Main {
    public static void main(String[] agrs) {
        // Operators
        int a = 5;
        int b = 3;
        System.out.println("a = 5");
        System.out.println("b = 3");

        //sum
        int sum = a+b;
        System.out.println("Sum of a & b is : "+sum);

        //diff
        int diff = a-b;
        System.out.println("diff of a & b is : "+diff);

        //multiply
        int prod = a*b;
        System.out.println("Product of a & b is : "+prod);
        
        //Divide
        // here it will drop numbers after decimal
        // If we want to retrive decimal values than a,b and div should be in double
        int div = a/b;
        System.out.println("Division of a & b is : "+div);
   
        //Remender(Modulo)
        int mod = a%b;
        System.out.println("Remender of a & b is : "+mod);

        //Unary operator
        int num = 3;
        System.out.println("Num : "+num);
        System.out.println("Output of num+1 with string : "+num+1);
        
        num = num+1;
        System.out.println("Output of num+1 : "+num);

        num = 3;
        num = num++;
        System.out.println("Output of num++ : "+num);

        num = 3;
        num = ++num;
        //Eror message : The assignment to variable num has no effect
        System.out.println("Output of ++num : "+num);

        num = 3;
        num = num--;
        System.out.println("Output of num-- : "+num);

        num = 3;
        num = --num;
        //Eror message : The assignment to variable num has no effect
        System.out.println("Output of --num : "+num);
        // operator ++/-- before num like ++/--num changes operator before
        // operator ++/-- after num like num++/-- changes operator before
            
    }
}