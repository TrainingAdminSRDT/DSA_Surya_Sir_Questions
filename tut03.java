public class tut03 {
    static int mul(int a ,int b )
    {
        if(a==0||b==0){
            return 0;
        }
        return a+mul(a,b-1);
    }
    public static void main(String[] args) {
    System.out.println(mul(4,5));
    }
    
}
