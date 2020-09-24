import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number to check whether is a prime number or not: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//        long startTime = System.currentTimeMillis();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number");
        }

//        long endTime = System.currentTimeMillis();
//        long time = endTime - startTime;
//        System.out.println(time);

        sc.close();
    }


    public static boolean isPrime(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
    }

//    public static boolean isPrime(int num) {
//
//        if (num == 2) {
//            return true;
//        }
//
//        if (num < 2 || num % 2 == 0) {
//            return false;
//        }
//
//        for (int i=3; i<=Math.sqrt(num); i+=2) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
