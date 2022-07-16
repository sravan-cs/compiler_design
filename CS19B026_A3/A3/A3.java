import syntaxtree.*;
import visitor.*;

public class A3 {
   public static void main(String [] args) {
      
      try {
         Node root = new MiniJavaParser(System.in).Goal();
         GJDepthFirst v=new GJDepthFirst<>();
         root.accept(v,null); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 

