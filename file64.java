import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      int numOne = s.nextInt();
      System.out.print("Enter the Second Number: ");
      int numTwo = s.nextInt();
      
      System.out.println("\n----Before Swap----");
      System.out.println("numOne = " +numOne);
      System.out.println("numTwo = " +numTwo);
      
      numOne = numOne + numTwo;
      numTwo = numOne - numTwo;

