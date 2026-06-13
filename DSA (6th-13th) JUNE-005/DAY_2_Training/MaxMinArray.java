public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {5,9,75,13,2,58};
        int max = arr[0], min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Max: "+max+", Min: "+min);
    }
}