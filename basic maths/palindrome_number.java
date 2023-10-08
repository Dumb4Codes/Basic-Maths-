
public class palindrome_number {
    public static void main(String[] args) {
        
        System.out.println(palindromeNum(121));
    }
    
    public static boolean palindromeNum(int n){
        int copy = n;
        int reverse = 0;

        while(n!=0){
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        if(reverse == copy) return true;
        else return false;
    }
}
