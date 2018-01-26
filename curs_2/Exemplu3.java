public class Exemplu3 {

    public static void main(String [] args) {
        int zi = 6;
        
        switch(zi) {
            case 1: 
                System.out.print("Luni");
                break;
            case 2: 
                System.out.print("Marti");
                break;
            case 3: 
                System.out.print("Miercuri");
                break;
            case 4: 
                System.out.print("Joi");
                System.out.print("Joi");
                break;
            case 5: 
                System.out.print("Vineri");
                break;
            case 6: 
            case 7:
                System.out.print("Weekend");
                break;
            default:
                System.out.print("No such day!");
        }
        
        
    }

}