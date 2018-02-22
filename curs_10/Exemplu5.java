public class Exemplu5 {

    public static void main(String [] args) {
        Cat c1 = new Cat("Tom", 4);
        
        System.out.println(c1); //c1.toString()  Cat@ffa234
        
        int [] x1 = new int[10];
        int [][] x2 = new int[4][];
        
        System.out.println(x1); // [I@ff23345
        System.out.println(x2); // [[I@ff3456    
    }
}