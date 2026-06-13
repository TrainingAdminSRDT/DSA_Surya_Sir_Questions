public class MaxMin_array{
    public static void main(String[] args) {
        int a[] = {5,9,95,2,17};                //O(1)
        int max = Integer.MIN_VALUE;            //O(1)
        int min = Integer.MAX_VALUE;            //O(1)
        for (int i : a) {                       //o(N)
            if ( i > max){                      //O(1)
                max = i;
            }
            else if( i < min){
                min = i;
            }
        }
        System.out.println(min+" "+max); // O(1)
    }
}

//TIME COMPLEXITY : O(n)