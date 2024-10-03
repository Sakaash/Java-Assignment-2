import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        System.out.println(greatestNumber(a,b,c));
    }
    static int greatestNumber(int a, int b, int c){
        return a>b ? (a>c?a:c) : (b>c?b:c);
    }
}
