class Solution {

    public boolean binSearch(int target,int start,int end){
        while(start<end){
            int mid= start + (end-start)/2;
            long sqr=(long)mid*mid;
            if(target==sqr)
                return true;
            if(target<sqr)
                end=mid-1;
            else
                start=mid+1;
            // System.out.println("mid"+mid);
        }
        
        return target==(long)start*start?true:false;
    }

    public boolean isPerfectSquare(int num) {
       
        int start=1;
        while(num>(long)start*start){
            start=start*2;
        }

        if(num==start*start)
            return true;
        // System.out.println("Here"+start);
        return binSearch(num,start/2,start);
    }
}