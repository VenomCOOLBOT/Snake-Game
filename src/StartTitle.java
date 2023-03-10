import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartTitle extends JFrame implements ActionListener {
    ImageIcon snakeIcon = new ImageIcon("C:\\Users\\vep_24cmseh\\IdeaProjects\\Snake Game\\Snake Icon.png");
    ImageIcon snakeTitle = new ImageIcon("C:\\Users\\vep_24cmseh\\IdeaProjects\\Snake Game\\SnakeTitleGUI.png");
    JLabel label = new JLabel();
    JButton button = new JButton();
    Border border1 = BorderFactory.createLineBorder(Color.green,4);
    Border border2 = BorderFactory.createLineBorder(Color.CYAN, 3);


    StartTitle(){
        playButton();
        titleScreenLabels();
        windowFrame();
    }


    private void windowFrame() {
        this.setSize(800, 800);
        this.setTitle("Snake Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setIconImage(snakeIcon.getImage());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(label);
        this.add(button);

    }
    private void titleScreenLabels() {
        label.setText("Developed By: Vernon Pitney");
        label.setIcon(snakeTitle);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.CYAN);
        label.setFont(new Font("Monospaced", Font.BOLD, 15));
        label.setIconTextGap(-30);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border1);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(250, 250, 300, 150);
    }

    private void playButton() {
        button.setBounds(300, 500, 200, 50);
        button.setText("PLAY");
        button.setFont(new Font("Times New Roman", Font.BOLD, 30));
        button.setBackground(Color.blue);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        button.setBorder(border2);
        button.setFocusable(false);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            this.dispose();
            new GameFrame();
        }
    }
}
