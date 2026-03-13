public class TestRecursion {

    //space : jitni bar a create hua hai, (a-b+1)
    //recursion stack hi hota hai internally
    //return ek jagah pr jake store krta h memory par
    //time bachane jaenge arraylist mai to space badh jaiga
    
    public static void pppppppp(int a, int b) {
        return;
    }

    public static void ppppppp(int a, int b) {
        System.out.println(a);
        pppppppp(a + 1, b);
        System.out.println("hi" + a);
    }

    public static void pppppp(int a, int b) {
        System.out.println(a);
        ppppppp(a + 1, b);
        System.out.println("hi" + a);
    }

    public static void ppppp(int a, int b) {
        System.out.println(a);
        pppppp(a + 1, b);
        System.out.println("hi" + a);
    }

    public static void pppp(int a, int b) {
        System.out.println(a);
        ppppp(a + 1, b);
        System.out.println("hi" + a);
    }

    public static void ppp(int a, int b) {
        System.out.println(a);
        pppp(a + 1, b);
        System.out.println("hi" + a);
    }

    public static void pp(int a, int b) {
        System.out.println(a);
        ppp(a + 1, b);
        System.out.println("hi" + a);
    }

    public static void p(int a, int b) {
        System.out.println(a);
        pp(a + 1, b);
        System.out.println("hi" + a);
    }

    public static void main(String[] args) {
        p(1, 1);
    }
}