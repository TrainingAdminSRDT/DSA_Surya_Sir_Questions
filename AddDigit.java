class Solution {
    public int addDigits(int num) {

       
        int sm =num;


        while(true){
            int temp = sm;
            int cnt=0;
            sm=0;
            while(temp>0){
                sm+=temp%10;
                cnt+=1;
                temp=temp/10;
            }
            if(cnt<=1)
                break;
        }

        return sm;

    }
}