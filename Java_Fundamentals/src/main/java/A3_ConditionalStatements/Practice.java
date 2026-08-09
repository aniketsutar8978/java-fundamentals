package A3_Conditionalstatement;
import java.util.Scanner;
public class Practice {
	
	

	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	// 1) Problem statement: Online Shopping billing
    	// Input    ==> Total amount, Customer type(Prime/Regular)
    	// Discount ==> >5000:20%, >2000:10%, else0% 
    	// Delivery ==> Prime:Free, Regular:>1000 free, else 100 Rs
    	// Output   ==> Discount, Delivery charge, Final amount in final receipt
    	
//    	double discount = 0;
//    	String dis_applied;
//    	double delivery_charge = 0;
//    	double final_amount = 0;
//    	
//    	System.out.println("Enter your total amount");
//    	Double total_amount = sc.nextDouble();
//    	if(total_amount>5000) {
//    		dis_applied = "Discount applied 20%";
//    		discount = total_amount*0.2;		
//    	}
//    	else if(total_amount>2000) {
//    		dis_applied = "Discount applied 10%";
//    		discount = total_amount*0.1;		
//    	}
//    	else {
//    		dis_applied = "No discount";
//    		discount = 0;
//    	}
//    	final_amount = total_amount-discount;
//    	System.out.println("Enter customer type: Prime/Regular");
//    	String cust_type  = sc.next();
//    	if(cust_type.equals("Prime")) {
//    		delivery_charge = 0;
//			final_amount = final_amount;
//		}
//		else if(cust_type.equals("Regular")) {
//		     if(total_amount>1000) {
//		    	 delivery_charge = 0;
//		    	 final_amount = final_amount;
//		     }
//		     else {
//		    	 delivery_charge = 100;
//		    	 final_amount+=delivery_charge;
//		     }
//		}
//		else {System.out.println("Invalid customer");}
//    	
//    	System.out.println("==========Final receipt==========");
//    	System.out.println("Total amount is : "+ total_amount +"Rs");
//    	System.out.println("Discount applied: "+ dis_applied);
//    	System.out.println("Discount amount : "+ discount +"Rs");
//    	System.out.println("Delivery charges: "+ delivery_charge +"Rs");
//    	System.out.println("Final amount    : "+ final_amount+"Rs");
    		

    	
 
    	// 2) Parking Fee System
    	// Input   ==> Hours parked
    	// Rules:
    	// 0-2 hrs ==> Rs20/hour
    	// 3-5 hrs ==> Rs30/hour
    	// 5-10 hrs==> Rs50/hour
    	// >10     ==> >10 Rs100/hour and add Rs100 fine
    	// Output  ==> Total Parking Fee
    	
//    	System.out.println("Enter how many hours you want to park");
//    	int hours = sc.nextInt();
//    	int park_fee = 0;
//    	int total_fee = 0;
//    	int fine = 0;
//    	int total_amount = 0;
//    	if(hours>0 && hours<=2) {
//    		park_fee=20;
//    	}
//    	else if(hours>=3 && hours<5) {
//    		park_fee=30;
//    	}
//    	else if(hours>=5 && hours <=10) {
//    		park_fee=50;	
//    	}
//    	total_fee=park_fee*hours;
//    	total_amount=total_fee;
//    	
//    	if(hours>10) {
//    		park_fee = 100;
//    		total_fee = (park_fee*hours);
//    		System.out.println("Total fee is: "+ total_fee+"Rs");
//    		fine=100;
//    		System.out.println("Fine is: "+ fine+"Rs");
//    		total_amount=total_fee+fine;
//    	}
//    	System.out.println("Total amount: "+ total_fee+"Rs");
//    	
    	
    	
    	
    	
    	
    	// 4) Salary Calculation System
    	// Input ==> Basic salary
    	// rules:
    	// Allowance ==> >=50000:20%, >=20000:10%, else 5%
    	// Tax       ==> >=50000:15%, >=20000:10%, else 0%
    	// Output ===> Salary, allowace, tax, Net salary
    	
//    	System.out.println("Enter your Basic Salary");
//    	double salary = sc.nextDouble();
//    	double allowance = 0;
//    	double tax = 0;
//    	double net_salary=0;
//    	if(salary>=50000) {
//    		allowance = salary*0.2;
//    		tax=salary*0.15;
//    	}
//    	else if(salary>=20000) {
//    		allowance = salary*0.1;
//    		tax = salary*0.1;
//    	}
//    	else {
//    		allowance = salary*0.5;
//    		tax = 0;
//    	}
//    	net_salary = (salary+allowance)-tax;
//    	
//    	System.out.println("Salary is    : "+ salary);
//    	System.out.println("Allowance is : "+ allowance);
//    	System.out.println("Tax is       : " + tax);
//    	System.out.println("Net Salary is: "+ net_salary);
    	
    	
    	
    	
    	
    	// 5) Online Shopping Cart
    	// Input ==> Total cart value, Customer type(Prime of Regular), Coupon code
    	// Discount = prime 10%, Regular 5%
    	// Coupon code "SAVE100" ==> Rs100 off, "SAVE200" ==> Rs200 off
    	// Shipping: Free for total >1000, else 50
    	// Output Final Receipt 
    	
//    	System.out.println("Enter your total cart value");
//    	double total_value = sc.nextDouble();
//    	System.out.println("Enter your customer type");
//    	String c_type = sc.next();
//    	System.out.println("Enter your cupone code");
//    	String cupone = sc.next();
//    	String off = " ";
//    	String dis_applied=" ";
//    	double discount = 0;
//    	int shipping = 0;
//    	double total_amount = 0;
//    	
//    	if(c_type.equals("Prime")) {
//    		dis_applied = "Discount applied 10%";
//    		discount = total_value*0.1;
//    	}
//    	else if(c_type.equals("Regular")) {
//    		dis_applied = "Disscount applied 5%";
//    		discount = total_value*0.05;
//    	}
//    	else {System.out.println("Invallid");}
    	
//    	total_amount = total_value - discount;
//    	
//    	if(cupone.equals("SAVE100")) {
//    		off = "100Rs";
//    		total_amount = total_amount-100;
//    	}
//    	else if(cupone.equals("SAVE200")) {
//    		off = "200Rs";
//    		total_amount = total_amount-200;
//    	}
//    	else {System.out.println("Sorry try next time");}
//    	
//    	if(total_amount<1000) {
//    		shipping = 50;	
//    		total_amount = total_amount + shipping;
//    	}
//    	System.out.println("========== Final Reciept==========");
//    	System.out.println("Total value is     : "+ total_value);
//    	System.out.println("You are            : "+ c_type + "Customer");
//    	System.out.println("Discount applied is: "+ dis_applied);
//    	System.out.println("Discount amount is : "+ discount);
//    	System.out.println("Your cupone code is: "+ cupone);
//    	System.out.println("Off on coupen is   : "+ off);
//    	System.out.println("Shipping charges is: "+ shipping);
//    	System.out.println("Total amount is    : "+ total_amount);
    	
    	
    	
    	
    	
    	
    	// Hotel Booking System
    	// Input==> Numbers of nights, Room type(Standard/ Deluxe/ Suite), Extra service (Breakfast/SPA)
    	// Rules;
    	// Room charges: Standard:-1500/night, deluxe 2500/night, Suite 4000/night
    	// Extra service: Brekafast 300/ day, SPA 500/ day
    	// Discount: Nights>7=10% discount on totalrent
    	// tax 5% of total
    	// Output total bil
    	System.out.println("=+=+=Welsome To Radheshyam Hotel=+=+=");
    	System.out.println("Enter the numbers of night");
    	int nights = sc.nextInt();
    	System.out.println("Select type of your room");
    	System.out.println("1) Standard 1500Rs/ Nights");
    	System.out.println("2) Deluxe 2500Rs/ Nights");
    	System.out.println("3) Suite 4000Rs/ Nights");
    	int type = sc.nextInt();
    	double rent = 0; 
    	double total_rent = 0;
    	double discount = 0;
    	double final_rent = 0;
    	double break_charges=0;
     	double SPA_charges=0;
    	double total_amount = 0;
     	String type1 = "";
     	String dis_applied="";
    	
    	if(type==1) {
    		rent = 1500;
    		type1 = "Standard";
    	}
    	else if(type==2) {
    		rent = 2500;
    		type1 = "Deluxe";
    	}
    	else if(type==3) {
    		rent = 4000;
    		type1 = "Sute";
    	}
    	else {System.out.println("Invallid choice");}
     	total_rent = nights*rent;
     	
    	if(nights>7) {
    		dis_applied = "Discount applied 10%";
    		discount=total_rent*0.1;
    		final_rent = total_rent - discount;
    	}
    	else {
    		dis_applied = "No discount";
    		final_rent = total_rent;}
     	
    	System.out.println("Extra services");
    	System.out.println("1) Breakfast 300/day");
    	System.out.println("2) SPA 500/day");
    	System.out.println("Do you want breakfast?");
    	System.out.println("a) Yes");
    	System.out.println("b) No");   	
    	char ans = sc.next().charAt(0);
    	if(ans=='a') {
    		break_charges=300*nights;
    	}
    	System.out.println("Do you want SPA?");
    	System.out.println("a) Yes");
    	System.out.println("b) No");
    	char ans1 = sc.next().charAt(0);
    	if(ans1=='a') {
    		SPA_charges=500*nights;
    	}
    	total_amount = final_rent + break_charges + SPA_charges ;
    	String tax = "5%";
    	double tax_amount = total_amount*0.05;
    	double final_amount = total_amount+tax_amount;
    	

    	System.out.println("==========Final Recipt===========");
    	System.out.println("=+=+=+Radheshyam Hotel+=+=+=");
    	System.out.println("Your room type is    : "+type1);
    	System.out.println("You want room for    : "+nights+" Nights");
    	System.out.println("Total rent is        : "+total_rent);
    	System.out.println("Discount applied is  : "+dis_applied);
    	System.out.println("Final rent           : "+final_rent);
    	System.out.println("Breakfast charges    : "+break_charges);
    	System.out.println("SPA charges          : "+SPA_charges);
    	System.out.println("Your total amount is : "+total_amount);
    	System.out.println("Discount amount is   : "+discount);
    	System.out.println("Tax is               : "+tax);
    	System.out.println("Tax amount is        : "+tax_amount);
    	System.out.println("Final amount is:     : "+total_amount);
    	System.out.println("Thanks for visiting Radheshyam Hotel");
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    			
    	
    
    			
   
    	
  
    }

}
