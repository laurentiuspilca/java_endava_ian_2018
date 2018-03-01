public class Cat {

    String name;
    
    public void finalize() {
        System.out.println("Terminating cat");
    }
    
}