package snake.game;

import javax.swing.*;

public class Snake extends JFrame {

    Snake () {

        this.add(new Board());
        this.pack();

        this.setLocationRelativeTo(null);
        this.setTitle("Snake Game");
        this.setResizable(false);
    }

    public static void main(String[] args) {
        new Snake().setVisible(true);
    }
}
