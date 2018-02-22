public class Cat {

    String name;
    int age;
    
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + " " + age;
    }
    
    public boolean equals(Object o) {
        if (o == null) return false;
        
        if (o instanceof Cat) {
            Cat c = (Cat) o;
            return c.age == this.age;
        } 
        
        return false;
    }
    
    public int hashCode() {
        return 0;
    }
}