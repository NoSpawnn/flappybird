import javax.swing.JFrame;

public class App {
    public static final int boardWidth = 360;
    public static final int boardHeight = 640;

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Flappy Bird");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(boardWidth, boardHeight);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        flappyBird.requestFocus();
        frame.pack();

        frame.setVisible(true);
    }
}
