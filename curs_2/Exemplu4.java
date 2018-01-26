public class Exemplu4 {

    public static void main(String [] args) {
        char anotimp = 'p';
        
        switch(anotimp) {
            case 'v':
                System.out.print("Este cald");
                break;
            case 'i':
                System.out.print("Este frig");
                break;
            case 'p':
            case 't':
                System.out.print("Ploua");
        }
    }
}