import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score :");
        int score = scanner.nextInt();
        scanner.close();
        printGrade(score);
    }

    static void printGrade(int score) {
        if(score<0 || score>100){
            System.out.println("Invalid Score!!!");
            return;
        }
        System.out.print("Your grade is ");
        switch (score/10) {
            case 10:
                System.out.print('O');
                break;
            case 9 :
                System.out.print('O');
                break;
            case 8:
                System.out.print("A+");
                break;
            case 7:
                System.out.print('A');
                break;
            case 6:
                System.out.print("B+");
                break;
            case 5:
                System.out.print('B');
                break;
            default:
                System.out.println('U');
        }
        System.out.println();
    }

}
