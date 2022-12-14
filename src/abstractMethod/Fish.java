package abstractMethod;

public class Fish extends Animal {

    public Fish(String name) {
        this.name = name;
    }

    @Override
    void run() {
        System.out.println(name+" can't run, cause she is a fish");
    }

    @Override
    void canEat() {
        System.out.println(name+" eat Takari");
    }
}
