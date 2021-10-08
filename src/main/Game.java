package main;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Game extends JFrame {
    private GameScreen gameScreen;

    private BufferedImage img;

    //Game constructor
    public Game() {
        importImg();
        setSize(640,640); //Sets Window Size

        setDefaultCloseOperation(EXIT_ON_CLOSE); //Closes process on Window close.
        setLocationRelativeTo(null); //Window starts in middle of screen
        gameScreen = new GameScreen(img);
        add(gameScreen);
        setVisible(true); //Sets application to visible!

    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/spriteatlas.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World! Start of my game.");

        Game game = new Game();
    }
}
