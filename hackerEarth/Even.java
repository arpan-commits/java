package hackerEarth;

public class Even {
    public static void main(String[] args) {
        System.out.println(OddEven(12));
    }

    static boolean OddEven(int number) {

        if (number % 2 == 0)
            return true;
        else
            return false;
    }

}
