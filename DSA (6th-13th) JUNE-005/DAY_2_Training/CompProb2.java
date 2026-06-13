public class CompProb2 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i < n; i++){               // complexity: O(n)
            for(int j = 1; j < n; j*=5){          //complexity: O(log n)
                System.out.println(j);
            }
            System.out.println(i);
        
        }
    }
}

//complexity: O(n log n)