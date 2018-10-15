import javax.swing.*;
/**
 * BouncingBallsWindow is the top level of three that produce a window with
 * n animated bouncing balls in it.
 * 
 * @author Patricia Liu
 * @version 1
 */
public class BouncingBallsWindow extends JFrame {
    public BouncingBallsWindow() { // Create window
        setTitle("Bouncing Balls");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new BouncingBalls()); // Add bouncing balls panel

        pack();
        setLocationRelativeTo(null); // Center window in display screen
    }

    public static void main(String[] args) {
        // Run GUI in the Event Dispatcher Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    // Set up main window (using Swing's Jframe)
                    BouncingBallsWindow bbw = new BouncingBallsWindow();
                    bbw.setVisible(true);
                }
            });
    }
}