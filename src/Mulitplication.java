import java.util.Scanner;

public class Mulitplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to get its first 10 multiples : ");
        int number = scanner.nextInt();
        scanner.close();
        printMultiples(number);
    }
    static void printMultiples(int n){
        System.out.println();
        System.out.println("The multiples are");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d  * %2d = %2d \n", n,i,n*i);
        }
    }
}
