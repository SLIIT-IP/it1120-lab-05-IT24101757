import java.util.Scanner;
public class IT24101757Lab5Q2
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   int no_member = 3;

   System.out.print("Enter the number of new members introduced: ");
   no_member = input.nextInt();


   if (no_member < 0)
   {
    System.out.print("Input must be a number 0 or greater"); 
   }

   else
   {

   switch (no_member)
   {
      case 0:
      System.out.print("No prize");
      break;

      case 1:
      System.out.print("Prize is a : Pen");
      break;

      case 2:
      System.out.print("Prize is a : Umbrella");
      break;

      case 3:
      System.out.print("Prize is a : Bag");
      break;

      case 4:
      System.out.print("Prize is a : Travelling Chair");
      break;

      default :
      System.out.print("Prize is a : Headphone");
  }
  }
  }
}