import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(sumEven(arr));
    }

    static int sumEven(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if(i%2 != 0)
                continue;
            sum+=i;
        }
        return sum;
    }
}
