import java.util.*;
public class Sudden {

    public static void main(String[] args) {
        
            Scanner  sc = new Scanner(System.in);

            System.out.println(" Enter Your Name");

            String name = sc.nextLine();
           
             System.out.println( "Enter Your Number");
             int number = sc.nextInt();
              
             if(number % 2 == 0){
               
                for( number = 1; number< 100;number++){

                    if(number % 2 != 0){
                        continue;
                    }
            
                    System.out.println( name + number);
                    

                }
  
           
             }
            

    }
}