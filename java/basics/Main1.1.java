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
