public class GCD_ofTwoNum {
    public static void main(String[] args) {
        // GCD = great common divisor 

        getGCD(8, 14);
    }
    public static void getGCD(int n1, int n2){

        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD of n1 and n2 is: "+n2); //when both no. is equal like (2, 2), it then escapes the while loop
    }
}
