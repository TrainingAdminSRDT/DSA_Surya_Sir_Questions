public class AddDigit {
    public static void main(String[] args) {
        int n = 123; // Example input
        int result = addDigits(n);
        System.out.println(result);
    }

    public static int addDigits(int num) {
           while(num>=10){
                int sum = 0;
            while(num >0){
                sum+= num%10;
                num/=10;
            }
            num = sum;
            
           }
           return num;
    
    }
}

