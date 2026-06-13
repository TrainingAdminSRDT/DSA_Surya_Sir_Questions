public class Q7 {
    public static int reverse(int x) {
        int rev =0;
        int rem =0;
        while(x!=0){
            rem = x%10;
            rev = rev*10 + rem;
            x = x / 10;
            }
            return rev;
            }
        public static void main(String[] args){
            reverse(123);
        }    
    }


