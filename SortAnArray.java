class Solution {
    public void merge(int arr[], int left,int mid,int right){
        
        int n1=mid-left+1,n2=right-mid;

        int ar1[] = new int[n1];
        int ar2[] = new int[n2];

        //Copying the first 
        for(int i=0;i<n1;i++){
            ar1[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            ar2[j]=arr[mid+1+j];
        }

        //Merging 
        int i=0,j=0;
        int c=left;
        while(i<n1 && j<n2){
            if(ar1[i]<ar2[j]){
                arr[c++]=ar1[i++];
            }else{
                arr[c++]=ar2[j++];
            }
        }

        while(i<n1){
            arr[c++]=ar1[i++];
        }

        while(j<n2){
            arr[c++]=ar2[j++];
        }
    }


    public void mergeSort(int [] arr,int left, int right){
        int mid = (left+right)/2;
        if(mid>left){
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
        }
        merge(arr,left,mid,right);
    }


    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}