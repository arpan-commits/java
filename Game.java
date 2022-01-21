import java.util.*;
public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //If n is odd, print Weird********************************************************************************
        System.out.println("Enter your number");

        int n = sc.nextInt();

        if(n%2 != 0){
            System.out.println("Weird");
       
        // If n is even and in the inclusive range of 2 to 5, print Not Weird**************************************************
        }else if(n%2 ==0  && n>= 2 && n<=5){
            System.out.println("Not Weird");
            // If n is even and in the inclusive range of 6 to 20 , print Weird
        }else if( n%2 == 0 && n>= 6 && n<=20 ){
            System.out.println("Weired");
            // If n is even and greater than 20, print Not Weird
        }else if(n%2 == 0 &&  n>20){

            System.out.println("Not Weired");
        }else{
            System.out.println("Invalid");
        }
        
   
   
   
   
   
    }
    
}
