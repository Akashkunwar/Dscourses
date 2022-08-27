
// Simple Hello world print
public class Main {
   public static void main(String[] args) {
      System.out.println("Hello, World!");
   }   
}

public class Main {
   public static void main(String[] args) {
      String name = "Akash";
      int age = 23;
      String collage = "IIT Madras";
      String myname = name;
      System.out.println("Hello"+name̥);
   }   
}

//Datatype
public class Main {
   public static void main(String[] args) { 
      /// Primitive data types
      //byte - byte	Stores whole numbers from -128 to 127
      byte age = 23;
      //short- 2 bytes [whole numbers from -32,768 to 32,767]
      short num = 9834;
      //int  - 4 bytes [whole numbers from -2,147,483,648 to 2,147,483,647]
      int phone = 983453244;
      //long - 4 bytes [whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
      long phone1 = 922337203685477L;
      //float -4 bytes [Sufficient for storing 6 to 7 decimal digits]
      float dec = 35.342F;
      //double-8 bytes [Sufficient for storing 15 decimal digits]
      double dec1 = 34.6787988923D;
      //char - 2 bytes [Stores a single character/letter or ASCII values
      char letter = 'a';
      //boolean-1 bytes [True/False]
      boolean isadult = true;
   }   
}


// Rename file by Main.java
// String
public class Main {
   public static void main(String[] args) { 
      
      /// Non-Primitive data types
      // String
      String fname = "Akash ";
      
      // Concatination
      String lname = "Kunwar";
      System.out.println("My name is : " + fname + lname);
      
      //caeAt at that index
      System.out.println("letter at index 2 in fname is : " + fname.charAt(2));
      
      //length
      System.out.println("Length of fname is : " + fname.length());
      
      //replace in new string
      String name2 = fname.replace('a','s');
      System.out.println("Replaced letter a with s : "+name2);

      //substring (start,end+1)
      String fullname = fname+lname;
      System.out.println("Full name is : "+fullname);
      System.out.println("Substring of Full name is : "+fullname.substring(0,5));
   } 
}

// Rename file by Main.java
// Arrays 
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       
    //     //Feeding marks to array if we don't know what to store
    //    int[] marks = new int[3];
    //    //Feeding marks to array
    //    marks[0] = 90;
    //    marks[1] = 91;
    //    marks[2] = 83;
       
        int[] marks = {92, 97,82};
       //It don't print array it print some jargons of some combination
       System.out.println(marks);

       //It prints array value at that place
       System.out.println("Marks at second place : "+marks[1]);

       //Length without paranthrsis
       System.out.println("Length of marks is : "+marks.length);
       System.out.println("1st marks before shorting : "+marks[0]);
       Arrays.sort(marks);
       System.out.println("1st marks after shorting : "+marks[0]);

       //To store 2D array we use
       int[][] finalmarks = {{94,99,80},{83,76,91}};
       System.out.println("Second place marks of 1st array : "+finalmarks[0][1]);
    }
}

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


// Rename file by Main.java
// Final value
public class Main {
    public static void main(String[] args) {
        // Final value can't be changed
        final float pi = 3.14F;
        // This will not work with final value
        // pi = 3.12F;
        System.out.println("Final value of pi :"+pi);
    }
}


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

// Rename file by Main.java
// Input fundtion

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        // Input
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.println("Input your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is : "+age);

        // float input
        System.out.println("Input your weight : ");
        float weight = sc.nextFloat();
        System.out.println("Your age is : "+weight);

        // // Any input can be done by replacing type like long, bool, byte, etc
        // System.out.println("Input your age : ");
        // xyz age = sc.nextXyz();
        // System.out.println("Your age is : "+age);

        // String input
        System.out.println("Input your Name : ");
        String name = sc.next();
        System.out.println("Your name is : "+name);

        // Line of string input
        // This work alone without input string
        System.out.println("Input your line : ");
        String line = sc.nextLine();
        System.out.println("Your age is : "+line);

        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your age is : "+weight);

    }
}



// Rename file by Main.java
// Comparision Operators

public class Main {
    public static void main(String[] agrs) {
        //Comparision Operators
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b
    }
}

// Rename file by Main.java
// Conditional Statement

public class Main {
    public static void main(String[] agrs) {
        //Conditional Statement
        //example 1
        boolean sun = true;
        if(sun == true)
            System.out.println("day");
        else
            System.out.println("night");

        // example 2
        int age = 12;
        if(age < 18)
            System.out.println("Can't vote");
        else
            System.out.println("Can vote");
    }
}


// Rename file by Main.java
// Logical operators Conditional Statement 

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


// Rename file by Main.java
// Conditional Statement  with Logical operators 
// More than 2 statement

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


// Rename file by Main.java
// do while loop example
// It prints user input untill user gives -ve number

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        // do while example
        Scanner sc = new Scanner(System.in);
        int number = 0; // can't initiate inside loop

        do{
            System.out.print("Input a number : ");
            number = sc.nextInt();
            System.out.print("You entered number: ");
            System.out.println(number);
        } while(number >=0);

        System.out.println("THE END");
    }
}


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



// Rename file by Main.java
// Creating methords/functions

public class Main {
    // Creating methods
    // method 1
    public static void printJava() {
         System.out.println("Hello java");
    }

    // method 2
    public static void printName(String name) {
        System.out.println("Hello "+name+"! How are you?");
    }

    // method 3
    public static void printSum(int a, int b) {
        int sum = a+b;
        System.out.println(+a+" + "+b+" = "+sum);
    }
    public static void main(String[] agrs) {
        // calling method 1
        printJava();
        printJava();
        printJava();
        
        // calling method 2
        printName("Akash");
        printName("Kunwar");

        // calling method 3
        printSum(3,5);
    }
}



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


//code 2
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

