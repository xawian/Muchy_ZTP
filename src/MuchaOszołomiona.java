import java.awt.*;

class MuchaOszołomiona implements MuchaState {
    private int czasPozostały;

    public MuchaOszołomiona() {
        czasPozostały = 100;
    }

    public void draw(Graphics g, Mucha mucha) {
        g.setColor(Color.red);
        Rectangle rc = g.getClipBounds();
        int a = (int)(mucha.x * rc.getWidth()),
                b = (int)(mucha.y * rc.getHeight());
        g.fillOval(a, b, 5, 5);
    }

    public void move(Mucha mucha) {
        mucha.x += mucha.vx / 2;
        mucha.y += mucha.vy / 2;

        --czasPozostały;
        if(czasPozostały == 0) {
            mucha.stan = new MuchaZatrzymana();
        }
    }
}