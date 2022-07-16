import syntaxtree.*;
import visitor.*;

public class A4 {
   public static void main(String [] args) {
      
      try {
         Node root = new microIRParser(System.in).Goal();
         GJDepthFirst v=new GJDepthFirst<>();
         root.accept(v,null); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 

