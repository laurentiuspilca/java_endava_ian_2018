public class Exemplu3 {

    public static void main(String [] args) {
        int [][] a1;
        a1 = new int[5][4];
        
        int c = 1;
        for (int i = 0; i<a1.length; i++) {
            for (int j = 0; j<a1[i].length; j++) {
                a1[i][j] = c;
                c++;
            }
        }
        
        for (int [] x : a1) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}