import java.util.Scanner;

public class NoOfEggs {
public static void main(String[] args) {
	
	int eggs;
	Scanner sc=new Scanner(System.in);   // No of Eggs - input from user
	eggs=sc.nextInt();
	
	int grossCount=0;					//count of gross eggs
	int dozenCount=0;					//count of dozen eggs
	int normalCount=0;					//count of left off eggs
	
	grossCount=eggs/144;
	dozenCount=(eggs-(grossCount*144))/12;
	normalCount=eggs-(grossCount*144)-(dozenCount*12);
		
	System.out.println("Your number of eggs is "+grossCount+" gross, "+dozenCount+" dozen, and "+normalCount);
	
}
}
