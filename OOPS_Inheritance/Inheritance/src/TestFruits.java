 class Fruit {
    private String name;
    private String taste;
    private int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void eat() {
        System.out.println("The " + name + " tastes " + taste);
    }
}
 class Apple extends Fruit {
    public Apple(String name, String taste, int size) {
        super(name, taste, size);
    }

    public void eat() {
        System.out.println("The apple tastes " + getTaste());
    }
}
 class Orange extends Fruit {
    public Orange(String name, String taste, int size) {
        super(name, taste, size);
    }

    public void eat() {
        System.out.println("The orange tastes " + getTaste());
    }
}
 public class TestFruits {
	    public static void main(String[] args) {
	        Fruit apple = new Apple("Apple", "sweet", 10);
	        Fruit orange = new Orange("Orange", "citru", 8);

	        apple.eat();
	        orange.eat();
	    }
	}

