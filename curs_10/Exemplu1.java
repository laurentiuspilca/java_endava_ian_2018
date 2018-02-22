public class Exemplu1 {

    public static void main(String [] args) {
        Coffee c1 = Coffee.SMALL;
        
        String name = Coffee.SMALL.name();
        int ordinal = Coffee.SMALL.ordinal();
        
        for (Coffee c : Coffee.values()) {
            System.out.println(c.name() + " " + c.ordinal());
        }
        
        switch (c1) { // int, char, String, enum
            case SMALL:
                System.out.println("Too small!");
                break;
        }
    }
}