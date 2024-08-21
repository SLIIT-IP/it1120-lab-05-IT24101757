import java.util.Scanner;
public class IT24101757Lab5Q1
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   int num1, num2, num3, max, min;
   
   System.out.print("Enter the first integer: ");
   num1 = input.nextInt();
   
   System.out.print("Enter the second integer: ");
   num2 = input.nextInt();
   
   System.out.print("Enter the third integer: ");
   num3 = input.nextInt();
   
        if(num1 > num2)
		{
		max=num1;
		min=num2;
		}
		else
		{
		max=num2;
		min=num1;
		}
		
		if(num3 > max)
		{
		max=num3;
		}
        
		if(min>num3)
		{
		min=num3;
		}
		
	System.out.println("User entered numbers are : " + num1 +" " +num2 +" "+ num3);
	System.out.println("The smallest number is : " + min);
	System.out.println("The largest number is : " + max);
    
	}
}