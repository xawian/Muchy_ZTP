import java.awt.*;

class MuchaNormalny implements MuchaState {
    public void draw(Graphics g, Mucha mucha) {
        g.setColor(Color.black);
        Rectangle rc = g.getClipBounds();
        int a = (int)(mucha.x * rc.getWidth()),
                b = (int)(mucha.y * rc.getHeight());
        g.fillOval(a, b, 5, 5);
    }

    public void move(Mucha mucha) {
        mucha.x += mucha.vx;
        mucha.y += mucha.vy;

        if(mucha.x < 0) { mucha.x = -mucha.x; mucha.vx = -mucha.vx; mucha.stan = new MuchaOszołomiona(); }
        if(mucha.x > 1) { mucha.x = 2 - mucha.x; mucha.vx = -mucha.vx; mucha.stan = new MuchaOszołomiona(); }
        if(mucha.y < 0) { mucha.y = -mucha.y; mucha.vy = -mucha.vy; mucha.stan = new MuchaOszołomiona(); }
        if(mucha.y > 1) { mucha.y = 2 - mucha.y; mucha.vy = -mucha.vy; mucha.stan = new MuchaOszołomiona(); }
    }
}