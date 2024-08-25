import java.util.Scanner;
public class IT24101757Lab5Q3
{
    public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int sDate, eDate, days, roomCharge;
        double amount, discount,  totalAmount;

	roomCharge = 48000;
	
	System.out.print("Enter start date (1-31): ");
	sDate = input.nextInt();
	
	System.out.print("Enter End date  (1-31):");
	eDate = input.nextInt();
	
	if (sDate<1 || sDate>31)
	{
	System.out.println("Error: Date must be between 1 and 31");
	}
	else if (eDate<1 || eDate>31)
	{
	System.out.println("Error: Date must be between 1 and 31");
	}
	else if (sDate > eDate)
	{
	System.out.println("Error: Start date must be less than End date");
	}
	else
	{
		days = eDate-sDate;
		System.out.println("Room charge per day: " + roomCharge + ".00" );
		System.out.println("Number of days reserved: " + days);
		
		if (days < 3) 
                {
                totalAmount = roomCharge * days;
                } 
                else if (days >= 3 && days <= 4) 
                {
                amount = roomCharge * days;
                discount = amount * 0.10; //discount = 10%
                totalAmount = amount - discount;
                } 
                else 
                {
                amount = roomCharge * days;
                discount = amount * 0.20; //discount = 20%
                totalAmount = amount - discount;
                }

                System.out.println("Total Amount to be paid: " + totalAmount);

	}	
	
	}
}	
	
	