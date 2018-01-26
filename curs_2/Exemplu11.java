public class Exemplu11 {

    public static void main(String [] args) {
        
        int i=0;
        
        for ( ;  ; ) {
            System.out.print(i);
            i=i+1;
            if (i == 10) break;
        }
        
        for (int j=0,k=10,y=5; k + j < y; j = j +5, k=k-1, y = y + 1) {
        }
    }
}