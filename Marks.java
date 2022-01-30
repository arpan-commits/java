import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if(marks<= 30){
            System.out.println("Fail");
        } else if(marks>=31 && marks<=60){
            System.out.println("Your Garde is C");
        } else if( marks>=61 && marks<=80){
            System.out.println("Your Grade is B");
        }else if(marks>=81 && marks<=100){
            System.out.println("Your Grade is A");
        } else{

            System.out.println(" Invalid Score : " + marks );
        }
         
    }
}
