public class NewClass2 {
        public static void main(String[] args) {
            //int i = -1 , j = -1, k = -1, l = 2,m;
            int i = 0, j=0, k=0, l=0, m;

             m = (( i++ != 0 && j++ != 0 && k++ != 0 ) || ( l++ != 0)) ? 1 : 0;
            System.out.println(i + " " + j + " " + k + " " + l + " " + m);
    }
}
