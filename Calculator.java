import java.util.*;
public class Calculator {
    public static void main(String[]  args){
        // System.out.println("Hello Mister");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first  Number");
		float a = sc.nextFloat();
		System.out.println("Enter your second Number");
		float b  = sc.nextFloat();
		
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Remainder");
	
		
		System.out.println("Enter your choice");
		
		float choice = sc.nextFloat();
		
		if(choice == 1 ) {
			System.out.println(a+b);
		} else if(choice == 2) {
			System.out.println(a -b );
		} else if  (choice == 3) {
			System.out.println(a * b);
		} else if (choice == 4) {
			System.out.println(a / b);
		} else if (choice == 5) {
			System.out.println(a %  b);
		} 
		
		else {
			System.out.println("Invalid Selection");
			
		}
		






    }
    
}
