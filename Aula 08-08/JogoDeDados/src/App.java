import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declarar e instanciar um objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);
        // declarar e instanciar um objeto da classe Random
        Random random = new Random();
        // declarar outras variáveis
        int number1, number2, sum, attempt, bet, option;
        boolean hit;
        // repetição do jogo
        do{
            number1 = random.nextInt(6) + 1;
            number2 = random.nextInt(6) + 1;
            sum = number1 + number2;
            System.out.println("Número: " + number1 + " - Número 2: " + number2 + " - Soma: " + sum);
            attempt = 3;
            hit = false;
            while(!hit && attempt > 0){
                System.out.println("Informe sua aposta: ");
                bet = scanner.nextInt();
                attempt--;
                if(sum == bet){
                    hit = true;
                }else{
                    System.out.println("Você errou! Você ainda possui " + attempt + " tentativas.");
                }
            }
            if(hit){
                System.out.println("Parabéns! Você acertou!");
            }else{
                System.out.println("Jogo encerrado!");
            }
            System.out.println("Deseja jogar novamente (0 = Sim, 1 = Não");
            option = scanner.nextInt();
        }while(option == 0);
    }
}
