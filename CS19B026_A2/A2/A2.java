import syntaxtree.*;
import visitor.*;

public class A2 {
   public static void main(String [] args) {
      
      try {
         Node root = new MiniJavaParser(System.in).Goal();
         GJDepthFirst v=new GJDepthFirst<>();
         root.accept(v,null); // Your assignment part is invoked here.
         System.out.println("Program type checked successfully");
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 

