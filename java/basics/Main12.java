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
