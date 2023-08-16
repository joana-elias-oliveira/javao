import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
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
            // verificar os valores gerados
            System.out.println("Número: " + number1 + " - Número 2: " + number2 + " - Soma: " + sum);
            attempt = 3;
            hit = false;
            while(!hit && attempt > 0){
                bet = Integer.parseInt(JOptionPane.showInputDialog("Informe sua aposta"));
                attempt--;
                if(sum == bet){
                    hit = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Você errou! Você ainda possui " + attempt + " tentativas.");
                }
            }
            if(hit){
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou!");
            }else{
                JOptionPane.showMessageDialog(null, "Jogo encerrado!");
            }
            option = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
        }while(option == 0);
    }
}
