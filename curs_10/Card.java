public class Card {

    String serie; // 12345   54321
    
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Card) {
            Card c = (Card) o;
            return this.serie.equals(c.serie);
        }
        
        return false;
    }
    
    public int hashCode() {
        return 0; // suma cifrelor
    }
    
    public void finalize() {
    }
}