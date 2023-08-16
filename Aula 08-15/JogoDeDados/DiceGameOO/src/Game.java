import java.util.Random;

public class Game {
    // atributos
    private int number1;
    private int number2;
    private int sum;
    private int chances;
    private Random random;

    public Game(){
        random = new Random();
        number1 = random.nextInt(6) + 1;
        number2 = random.nextInt(6) + 1;
        sum = number1 + number2;
        chances = 3;
    }

    public int getChances(){
        return chances;
    }

    public boolean play(int bet){
        if(chances > 0){
            chances--;
            if(sum == bet){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("Número 1: %d - Número 2: %d -  Soma: %d", number1, number2, sum);
    }

}