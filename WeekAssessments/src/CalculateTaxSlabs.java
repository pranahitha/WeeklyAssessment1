import java.util.Scanner;

public class CalculateTaxSlabs {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter you Income: ");
		int income=sc.nextInt();
		System.out.println("Please enter your gender: ");
		String gender=sc.next();
		
		//to tax slab according to gender
		if(gender.equals("Male"))
		{
			if(income>180000 && income<=500000)
			{
				System.out.println("10% tax");
			}
			else if(income>500000 && income<=800000)
			{
				
				System.out.println("20% tax");
			}
			else if(income>800000)
			{
				System.out.println("30% tax");;
			}
			else
			{
				System.out.println("No tax");
			}
			
		}else{
			if(income>190000 && income<=500000)
			{
				System.out.println("10% tax");
			}
			else if(income>500000 && income<=800000)
			{
				System.out.println("20% tax");
			}
			else if(income>800000)
			{
				System.out.println("30% tax");
			}
			else
			{
				System.out.println("No tax");
			}
						
		}
	}
}
