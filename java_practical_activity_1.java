package java_practical_activity_1;

import java.util.Scanner;

public class java_practical_activity_1 {
    public static void main(String[] args) {
    try {
    		// Declaration
        	Scanner input = new Scanner(System.in);
        	String f_name,l_name,course;
        	int year_registration;
        	float monthly_fee;
        	float anually_fee = 12;
   // Process Protocol 	
    	System.out.println("----Registration----Form---");
    	//NAME SECTION
    	System.out.println("Enter your First Name: ");
    	f_name = input.nextLine();
    	
    	System.out.println("Enter your Last Name: ");
    	l_name = input.next();
    	//YEAR SECTION
    	System.out.println("Enter your Registered Year: ");
    	year_registration = input.nextInt();
    	
    	//MONTHLY FEE
    	System.out.println("Enter Your Monthly : ");
    	monthly_fee = input.nextInt();
    	float anual_result = monthly_fee *  anually_fee;
    	// Result 
    	System.out.println("Hi MR/MRS " +l_name  +","+f_name+"."+"Welcome to");
    	System.out.println("our Exclusive Club. Your Member ID," + year_registration +"-" + l_name+ ".Your Montly Fee is ₱");
    	System.out.println(monthly_fee +" with fee of " + anual_result);
    	System.out.println("Enjoy your STAY!");
    	System.out.println(" ");
    	System.out.print("The Management");
    }catch(Exception e){
    	System.out.println("Your data is invalid");
    }
    	
    	//float monthly_interest = loan * m_rate;
    	//float annual_interest = monthly_interest * months_in_year;
    	

   
    	
    	
    	
    
   } // END OF the Code
}
