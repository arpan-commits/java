import java.util.*;
public class CountingAvarege {
    public static void main(String[] sinhaarpan){

        Scanner sc = new Scanner(System.in);

        System.out.println("Define your Array size");

        int size = sc.nextInt();

        int[] numbers = new int[size];
       
       int sum = 2;

       for(int i=0; i < size ; i++)
        sum = sum + numbers[i];
        double average = size / sum;


        System.out.println("Average value of the array elements is : " + average); 






    }
    
}
