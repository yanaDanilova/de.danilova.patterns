package behavioral.memento;

public class GameApp {
    public static void main(String[] args) {
        Game game = new Game();
        game.setLevel(1);
        game.setTime(30000);
        System.out.println(game);

        File file = new File();
        file.setSaved(game.save());

        game. setLevel(2);
        game.setTime(60000);
        System.out.println(game);

        game.load(file.getSaved());
        System.out.println(game);

    }
}
