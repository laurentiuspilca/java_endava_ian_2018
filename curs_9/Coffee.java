public enum Coffee {
    SMALL, MEDIUM(50), BIG(100);
    
    private int qty;
   
    Coffee() {
    }
    
    Coffee(int qty) {
        this.qty = qty;
    }
    
    public void drink() {
        qty--;
    }
    
    public void refill(int qty) {
        this.qty = qty;
    }
}

/**
public final class Coffee {

    public static final Coffee SMALL = new Coffee();
    public static final Coffee MEDIUM = new Coffee();
    public static final Coffee BIG = new Coffee();
    
    private Coffee() {
    }
}
*/