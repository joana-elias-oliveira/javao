public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        System.out.println(game);
        if(game.play(2)){
            System.out.println("Acertou!");
        }else{
            System.out.println("Errou");
            System.out.println("Chances: " + game.getChances());
        }
    }
}
