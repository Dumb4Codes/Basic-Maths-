
public class count_digits {
        public static void main(String[] args) {
            
           System.out.println(count(5342));
        }
        public static int count(int n){
            int cnt = 0;
            while(n>0){
                n = n / 10;
                cnt++;
            }
            return cnt;
        }
}
