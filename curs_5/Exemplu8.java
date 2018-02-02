public class Exemplu8 {

    public static void main(String [] args) {
        final int [] x = new int[5];
        
        for (int i = 0; i < x.length; i++) {
            x[i] = i+1;
        }
        
        for (int q : x) {
            System.out.println(q);
            q = 5;
        }
        
        
    }
}