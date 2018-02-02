public class Dog {
    
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void sayHam() {
        System.out.print("Ham! My name is " + name);
    }
}