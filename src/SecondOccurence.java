import java.util.Scanner;

public class SecondOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to be found");
        int element = scanner.nextInt();
        int index = secondIndex(arr,element);
        scanner.close();
        if(index==-1){
            System.out.println("Element has not appeared twice!");
        }
        else{
            System.out.println("Element found for the second time at index : "+index);
        }
    }

    static int secondIndex(int[] a, int element) {
        int count  = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==element) count++;
            if(count>1) return i;
        }
        return -1;
    }
}
