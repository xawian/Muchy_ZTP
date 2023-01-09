import javax.swing.*;
import java.awt.*;

public class MuchyStany extends JPanel implements Runnable {
    private Mucha[] ar;

    public MuchyStany() {
        this.setPreferredSize(new Dimension(640, 480));
        ar = new Mucha[30];
        for(int i = 0; i < ar.length; ++i) {
            ar[i] = new Mucha();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < ar.length; ++i) {
            ar[i].draw(g);
        }
    }

    public void run() {
        while(true) {
            for(int i = 0; i < ar.length; ++i) {
                ar[i].move();
            }
            repaint();
            try {
                Thread.currentThread().sleep(20);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Muchy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MuchyStany m = new MuchyStany();
        frame.getContentPane().add(m);
        frame.pack();
        frame.setVisible(true);
        new Thread(m).start();
    }
}