import javax.swing.*;

public class GameFrame extends JFrame{
    ImageIcon snakeIcon = new ImageIcon("C:\\Users\\vep_24cmseh\\IdeaProjects\\Snake Game\\Snake Icon.png");
    GameFrame(){
        this.setIconImage(snakeIcon.getImage());
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}