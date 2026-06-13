import java.util.Scanner;

public class findCenter {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        int d = edges[1][1];
        
        return (a == c || a == d) ? a : b;
    }

    public static void main(String[] args) {
        findCenter solver = new findCenter();
        
        int[][] testEdges = {
            {1, 2},
            {2, 3},
            {4, 2}
        };
        
        int center = solver.findCenter(testEdges);
        System.out.println(center);
    }
}
