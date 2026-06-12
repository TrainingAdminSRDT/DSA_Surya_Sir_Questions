
    public static void main(String args[]){
        int x=2;
        int y=--x+x+++x--;
        System.out.println(x);
        System.out.println(y);

    }




// 7 Reverse Integer


class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)return 0;
        return(int) rev;
    }
}




// Question 3



    public static void main(String args[]){
        int i=-1; int j=-1; int k=-1; int l=2; 
      boolean m=((i++ !=0 && j++ !=0 && k++ !=0) ||(l++ !=0));
        System.out.println (i);
        System.out.println (j);
        System.out.println (k);
        System.out.println (l);
        System.out.println (m);
    }
    

// 258  Add Digits



class Solution {
    public int addDigits(int num) {
        int sum=0;
    
         sum=num%9;
        if(num % 9==0){
            sum=9;
        }
        if(num ==0){
            sum=0;
        }
        return sum;

        
    }
}
    

// 190  Reverse Bits



public class Solution{
    public int reverseBits(int n){
        int ans=0;
        int mask=1;
        for(int i=0;i<32;i++){
            if((mask&n)!=0){
                ans+=1<<31-i;
            }
            mask<<=1;
        }
        return ans;
    }
}


    