
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // String[] arr=s.split(" ");
        // int n=arr.length-1;
        // String str=arr[n];
        // return str.length();


        // int i=s.length()-1;
        // while(i>=0 && s.charAt(i)==' ' ) {i--;}
        // int c=0;
        // while(i>=0 && s.charAt(i)!=' ' ) {
        //     if(s.charAt(i)==' ') break;
        //    c++;
        // }
        // return c;

        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                c++;

            }
            else if(c>0){return c;}
        }
        return c;
    }

}
