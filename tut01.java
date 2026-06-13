public class tut01{
    public static void main (String [] args){
    int arr[]={5,6,6,76,5,2};
   int min= arr[0];
   int max = arr[0];

   for(int i=0;i<arr.length;i++){
    // min =Math.min(min,arr[i]);
    // max=Math.max(max,arr[i]);

    min =min<arr[i]?min:arr[i];
    max =max>arr[i]?max:arr[i];

   }

   System.out.println(min);
   System.out.println(max);
    }
}