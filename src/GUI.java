import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements MouseListener, ActionListener {

    private JFrame menuFrame;
    private JFrame gameFrame;
    private JPanel background;

    public GUI() {
        setup();
    }

    private void setup() {
        menuFrame = new JFrame("Menu");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        menuFrame.setSize(width/2, height/2);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        background = new JPanel();
        JLabel image = new JLabel(new ImageIcon("src/background.png"));
        background.add(image);
        background.addMouseListener(this);

        JButton play = new JButton("Play");
        play.addActionListener(this);
        background.add(play);

        JButton help = new JButton("Help");
        help.addActionListener(this);
        background.add(help);

        menuFrame.add(background, BorderLayout.CENTER);

        menuFrame.setVisible(true);
    }

    private void play() {
        menuFrame.setVisible(false);

        gameFrame = new JFrame("Doodle Jump");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        gameFrame.setSize(width/2, height/2);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gameFrame.setVisible(true);
    }

    // interface methods
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) (e.getSource());
        String text = button.getText();

        if (text.equals("Play")) {
            play();
        } else if (text.equals("Help")) {
            System.out.println("A and D keys to move, space to jump");
        }

    }
}
