public class Exemplu1 {

    public static void main(String [] args) {
        Forma f1 = new Cerc(10);
        Forma f2 = new Dreptunghi();
        
        //Forma f3 = new Forma(); error!
        
        System.out.println(f1.getArie());
        
        Forma [] v = new Forma[10];
        Forma f3;
        v[0] = new Cerc(10);
        
        System.out.println(v[1]);
    }
}