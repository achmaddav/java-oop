package abstractMethod;

public class Turtle extends Animal {

    public Turtle(String name) {
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("Turtle "+name+" can't run");
    }

    @Override
    void canEat() {
        System.out.println(name+" eat insect");
    }
}
