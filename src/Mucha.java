import java.awt.*;

class Mucha {
    private final double k = 0.01;
    double x, y; // pozycja muchy
    double vx, vy; // prędkość muchy

    MuchaState stan; // aktualny stan muchy

    public Mucha() {
        x = Math.random();
        y = Math.random();
        vx = k * (Math.random() - Math.random());
        vy = k * (Math.random() - Math.random());

        stan = new MuchaNormalny();
    }

    public void draw(Graphics g) {
        stan.draw(g, this);
    }

    public void move() {
        stan.move(this);
    }
}