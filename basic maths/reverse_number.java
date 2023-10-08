
public class reverse_number {
    public static void main(String[] args) {

        System.out.println(reverseNum(523));
        
    }
    public static int reverseNum(int n){
        int reverse = 0;

        while(n!=0){
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        return reverse;
    }
}
