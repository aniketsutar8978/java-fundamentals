package A8_Transfer_Statement;
import java.util.Scanner;
public class Project2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int final_amount = 0;
		String bill = "";
		while(true) {
		System.out.println("===Menue cart===");	
		System.out.println("1) Pizza Rs200");
		System.out.println("2) Burger Rs100");
		System.out.println("3) Sandwich Rs80");
		System.out.println("4) Exit");
		System.out.println("5) Final Bill");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		String item = "";
		int price = 0;
		int qty = 0;
		int amount = 0;
		
		switch(choice) {
		case 1:
			item = "Pizza";
			price = 200;
			break;
		
        case 2:
			item = "Burger";
			price = 100;
			break;
		
        case 3:
        	item = "Sandwich";
        	price = 80;
			break;
		
        case 4:
        	System.out.println("Thanks for visiting");
        	break;
        case 5:
           	System.out.println("===Final Bill===");
           	System.out.println(bill);
         	System.out.println("Final    : "+ final_amount);
         	System.out.println("=====================================================");
        	break;
        	
        default:
        	System.out.println("Invalid choice please enter valid choice");	
		}
		
		System.out.println("Enter your quantity");
		qty = sc.nextInt();
		amount = qty*price;
	 	final_amount= +final_amount+amount;
	 	bill += item+"*"+qty+" = Rs"+amount+" ";
	 	System.out.println("Item added successfully");
     	}
			
		
				
		
	}

}
