public class Q258 {
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 0;
        }
        return num%9;
    }
    public static void main(String[] args){
        System.out.print(addDigits(45));
    }
}
    

