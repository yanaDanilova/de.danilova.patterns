package behavioral.visitor;

public class VisitorApp {

    public static void main(String[] args) {
        Man man = new Man();
        Women women = new Women();

        CarBody carBody = new CarBody();
        Engine engine = new Engine();

        engine.accept(man);
        engine.accept(women);

        carBody.accept(man);
        carBody.accept(women);

    }


}
