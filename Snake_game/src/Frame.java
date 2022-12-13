import javax.swing.JFrame;

public class Frame extends JFrame{
    Frame() {
        this.add(new Panel());
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ensuring same experience across different devices
        this.setResizable(false);
        this.pack();
        this.setVisible(true);

        //making sure the frame spawns in the center of the screen
        this.setLocationRelativeTo(null);

    }
}
