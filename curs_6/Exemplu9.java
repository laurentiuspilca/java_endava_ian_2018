public class Exemplu9 {

    public static void main(String [] args) {
        int [][] a1 = new int[][]{{}, null, {5,6,7}};
        int [] a2 = new int[]{5,6,7,8};
        
        a1[0] = a2;
        a1[1] = a2;
        a1[2] = a2;
    }
}