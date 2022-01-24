import java.util.*;
public class Array {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    
     System.out.println("Input your array");
         int name = sc.nextInt();


    int names[] = new int[name];

    
    for(int i=0; i<5; i++) {
        names[i] = sc.nextInt();
    }
   

     for(int i=0; i <name ; i++) {
         System.out.println(" Nummber " + (i+1) +" is : " + names[i]);

     }














     }  

 }

    
