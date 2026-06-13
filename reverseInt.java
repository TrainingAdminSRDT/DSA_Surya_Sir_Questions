class Solution {
    public int reverse(int x) {
        
        boolean isNegative = x<0 ? true : false;
        x = x<0 ? -x : x;
        long nx=0;
        while(x>0){
            nx = nx*10 + x%10;
            x=x/10;

        }
    


    nx=isNegative?-nx:nx;
    if(nx < -Math.pow(2,31)|| nx>(Math.pow(2,31)-1) )
    return 0;
    return (int)nx;
    }
}