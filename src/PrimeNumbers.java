public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("The prime numbers between 1 and 30 are");
        for(int i = 1; i<=30; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int num){
        if(num<=1)  
            return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0)   
                return false;
        }
        return true;
    }
}
