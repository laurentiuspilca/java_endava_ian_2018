public interface InstrumentMuzical {
    
    public static final int x = 10;
    int y = 10;
    
    public abstract void m1();
    void m2();
    
    default void m3 () {
        System.out.println(":)");
    }
    
    static void m4 () {
        System.out.println(":)");
    }
}