import java.awt.*;

class MuchaZatrzymana implements MuchaState {
    private int czasPozostały;

    public MuchaZatrzymana() {
        czasPozostały = 200;
    }

    public void draw(Graphics g, Mucha mucha) {
        g.setColor(Color.yellow);
        Rectangle rc = g.getClipBounds();
        int a = (int)(mucha.x * rc.getWidth()),
                b = (int)(mucha.y * rc.getHeight());
        g.fillOval(a, b, 5, 5);
    }

    public void move(Mucha mucha) {
        --czasPozostały;
        if(czasPozostały == 0) {
            mucha.stan = new MuchaNormalny();
        }
    }
}