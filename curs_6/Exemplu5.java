public class Exemplu5 {

    public static void main(String [] args) {
        int [][] a1 = new int[3][2];
        
        int w = 199;
        a1[0] = new int[4];
        a1[1] = new int[]{4,5,w,7,8};
        a1[2] = new int[7];
        
        for (int [] x : a1) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}