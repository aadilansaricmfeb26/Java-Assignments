public class IdentifyUninitializedVariables {

    public static void main(String[] args) {
        byte a = 10;
        short b = 100;
        int c = 1000;
        long d = 10000L;
        float e = 10000.0f;
        double f = 1000000;
        char g = 'A';
        boolean h = true;

       // System.out.println(a); //Compilation error before: variable a might not have been initialized

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
