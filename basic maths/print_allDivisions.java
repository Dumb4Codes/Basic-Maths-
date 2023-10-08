
public class print_allDivisions {
    public static void main(String[] args) {
        
        divisors(36);
    }
    public static void divisors(int n){
        /* 
        for(int i=1; i<=n; i++){
            if(n % i == 0) System.out.print(i+", ");
        }
        */

        for(int i=1; i*i<=n; i++){
            if(n % i == 0) System.out.print(i+" ");
            if(n / i != i)System.out.print(n / i+" "); //square of 6 is 36 
        }
    }
}
