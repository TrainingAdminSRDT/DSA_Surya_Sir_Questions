public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        //O(n)
        if(s.length() !=t.length() ) return false;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a' ]++;
            count[t.charAt(i)-'a' ]--;
        }
        for(int x:count){
            if(x!=0) return false;
        }
        return true;




    //O(nlogn)
        // char[] arr1=s.toCharArray();
        // char[] arr2=t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1,arr2);
    }
}
