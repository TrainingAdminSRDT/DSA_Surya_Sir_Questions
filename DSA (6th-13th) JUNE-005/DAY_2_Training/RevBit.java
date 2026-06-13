public class RevBit {
    public static void main(String[] args) {
        int n = 5; // Example input
        int reversed = reverseBits(n);
        System.out.println(reversed);
    }

    
    public static int reverseBits(int n) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
            r = (r << 1) | (n & 1);
            n >>>= 1;
        }
        return r;
    }
}
