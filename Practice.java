import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matter = sc.nextInt();

        int Number [] = new int[Matter];

        for(int i = 0; i < Matter; i ++){
            Number[i] = sc.nextInt();
        }



    for(int i = 0;  i < Matter; i ++ ){
        System.out.println("Your Number" + (i + 1) + " is : "  + Number[i]);  
      }

    
   

    }
}
