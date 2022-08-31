import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      int a = s.nextInt();
      System.out.print("Enter the Second Number: ");
      int b = s.nextInt();
      
      System.out.println("\n----Before Swap----");
      System.out.println("a = " +a);
      System.out.println("b = " +b);
      
      a = a^b;
      b = a^b;
      a = a^b;
      
      System.out.println("\n----After Swap----");
      System.out.println("a = " +a);
      System.out.println("b = " +b);
   }
}
