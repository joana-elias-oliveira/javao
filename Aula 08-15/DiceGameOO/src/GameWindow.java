import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
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
        // configurar a janela gráfica
        configureWindow();
    }

    public void createComponents(){
        panel = new JPanel();
        labelBet = new JLabel("Digite sua aposta:");
        fieldBet = new JTextField(5);
        fieldBet.setEnabled(false);
        buttonNewGame = new JButton("Novo Jogo");
        buttonNewGame.addActionListener(this);
        buttonPlay = new JButton("Jogar");
        buttonPlay.addActionListener(this);
        buttonPlay.setEnabled(false);
    }
    
    public void addComponents(){
        // adicionar os componentes gráficos ao container
        panel.add(labelBet);
        panel.add(fieldBet);
        panel.add(buttonNewGame);
        panel.add(buttonPlay);
        // adicionar o container a janela gráfica
        add(panel);
    }

    public void configureWindow(){
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // se for o botão para iniciar um novo jogo
        if(event.getSource() == buttonNewGame){
            // instanciar um novo jogo
            game = new Game();
            // habilitar o botão jogar
            buttonPlay.setEnabled(true);
            // limpar o campo de texto da aposta
            fieldBet.setText("");
            // halibitar o campo de texto da aposta
            fieldBet.setEnabled(true);
            // levar o curso para dentro do campo de texto
            fieldBet.grabFocus();
            // teste
            System.out.println(game);
        }
        
    }
}
