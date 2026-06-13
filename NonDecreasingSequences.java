class Solution {

    public void golf(int []nums,Set<List<Integer>> ans,int [][]nIndex,int lastIndex,Stack<Integer> curArr){
        if(lastIndex==nIndex.length){
            if(curArr.size()>1)
                ans.add( new ArrayList<>(curArr) );
            return;
        }
        
        if(curArr.size()>1)
            ans.add(new ArrayList<>(curArr) );

        for(int i =0 ;i<nIndex[lastIndex].length ; i++){
            if(nIndex[lastIndex][i]==0)
                continue;
            curArr.push(nums[ nIndex[lastIndex][i] ]);
            golf(nums,ans,nIndex,nIndex[lastIndex][i],curArr);
            curArr.pop();
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        
        int nIndex[][] = new int [nums.length][nums.length];

        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<=nums[j])
                    nIndex[i][c++]=j;
            }
        }

    Set<List<Integer>> ans = new HashSet<>();
    Stack<Integer> stck = new Stack<>();
    for(int i=0;i<nums.length;i++){
        stck.push(nums[i]);
        golf(nums,ans,nIndex,i,stck);
        stck.pop();
    }
    return new ArrayList<>(ans);
    }
}