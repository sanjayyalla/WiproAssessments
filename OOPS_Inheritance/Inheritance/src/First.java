class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Bird extends Animal {

    public void eat() {
        System.out.println("Bird is eating");
    }

    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class First {
    public static void main(String[] args) {
       
        Animal animal = new Animal();
        animal.eat();  
        animal.sleep();

       
        Bird bird = new Bird();
        bird.eat();    
        bird.sleep();   
        bird.fly();     
    }
}
