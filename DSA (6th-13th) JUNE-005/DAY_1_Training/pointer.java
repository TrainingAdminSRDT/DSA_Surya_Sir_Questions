public class pointer {

    static class Ptr { int v; Ptr(int x) { v = x; } }

    static void f(Ptr p) {
        p.v = 10;
    }

    static int main() {
        int a = 5, b = 7;

        /* ----- C code -----
        int a = 5, b = 7;
        int *p = &a, **q;
        f(a, &b);
        **q = &b;
        *p = 30;
        printf("%d %d", a, b);
        ----- Java equivalent ----- */
        Ptr p = new Ptr(a);   // int *p = &a
        Ptr q = new Ptr(b);   // int *q = &b

        f(p);                  // f(a)
        q.v = b;               // **q = &b
        p.v = 30;              // *p = 30

        System.out.println(a + " " + b);
        return 0;
    }

    public static void main(String[] args) {
        System.exit(main());
    }
}
