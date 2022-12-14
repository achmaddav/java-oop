package abstractMethod;

public class Sheep extends Animal {

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    void run() {
        System.out.println(name+" can run");
    }

    @Override
    void canEat() {
        System.out.println(name+" eat grass");
    }
}
