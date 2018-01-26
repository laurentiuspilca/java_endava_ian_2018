public class Exemplu9 {

    public static void main(String [] args) {
        int i=0;
        
        while(i < 10) {
            if (i % 2 == 0) {
                i = i + 1;
                continue;
            }
            System.out.print(i);
            i = i + 1;
        }
    }   
}