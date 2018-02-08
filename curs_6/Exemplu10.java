public class Exemplu10 {

    public static void main(String... args) {
        //int [] q = new int[6];
        //m1(q);
        //m3(10, 20, 30 ,40);
        
        //int [] x = new int[10];
        //m4();
        
        int [][] x = new int[6][8];
        m4(x);
    }
    
    static void m1(int... x) {
        System.out.println(x.length);
    }
    
    static void m2(String x, int... y) {
    }
    
    static void m3(int x, int... y) {
    }
    
    static void m4(int[]... x) { // x[][]
        System.out.println(x.length);
    }
}