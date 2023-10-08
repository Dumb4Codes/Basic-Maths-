
public class check_prime {
    public static void main(String[] args) {
        
        isPrime(149);
    }
    public static void isPrime(int n){

        int count = 0;
        for(int i=1; i<=n; i++){ // TC = O(n)
            if(n % i == 0) count++;
        }
        if(count == 2) System.out.println(n+ " is a prime number");
        else System.out.println(n+ " is not a prime number");
    }
}
