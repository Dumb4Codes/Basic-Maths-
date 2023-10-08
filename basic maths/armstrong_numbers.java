
public class armstrong_numbers {
    public static void main(String[] args) {

        System.out.println(checkArmstrong(371));
    }
    public static boolean checkArmstrong(int n){
        int reverse = 0;
        int sum = 0;
        int copy = n;
        while(n>0){
            int lastDigit = 0;
            lastDigit = n % 10;
            //reverse = (reverse * 10) + lastDigit;
            sum += (int) Math.pow(lastDigit, 3);
            n = n / 10;
        }
        if(copy == sum) return true;
        else return false;
    }
}

