import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener{

    private JPanel panel;
    private JLabel labelBet;
    private JTextField fieldBet;
    private JButton buttonNewGame;
    private JButton buttonPlay;

    private Game game;

    public GameWindow(){
        // instanciar os componentes de interface gráfica
        createComponents();
        // adicionar componentes de interface gráfica
        addComponents();
    }

    public void createComponents(){
        panel = new JPanel();
        labelBet = new JLabel("Digite sua aposta:");
        fieldBet = new JTextField(5);
        buttonNewGame = new JButton("Novo Jogo");
        buttonNewGame.addActionListener(this);
        buttonPlay = new JButton("Jogar");
        buttonPlay.addActionListener(this);
        buttonPlay.setEnabled(false);
    }
    
    public void addComponents(){
        
    }
}
