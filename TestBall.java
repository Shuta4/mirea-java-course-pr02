class TestBall {
    public static void main(String[] args) {
        var ball = new Ball();
        System.out.printf("Default ball: %s\n", ball);
        System.out.printf("Default ball position is (0; 0): %s\n", bts(ball.getX() == 0 && ball.getY() == 0));

        ball.setX(5);
        System.out.printf("Ball x is set: %s\n", bts(ball.getX() == 5));

        ball.setY(3);
        System.out.printf("Ball y is set: %s\n", bts(ball.getY() == 3));

        ball.setXY(3, 5);
        System.out.printf("Ball x and y is set: %s\n", bts(ball.getX() == 3 && ball.getY() == 5));

        ball.move(-1, -3.5);
        System.out.printf("Ball has moved: %s\n", bts(ball.getX() == 2 && ball.getY() == 1.5));

        System.out.printf("Default ball after some actions: %s\n", ball);

        var otherBall = new Ball(1, -1);
        System.out.printf("Another ball with set position: %s\n", otherBall);

        System.out.printf("Another ball position is set: %s\n", bts(otherBall.getX() == 1 && otherBall.getY() == -1));
    }

    static String bts(boolean b) {
        return b ? "OK" : "ERROR";
    }
}

class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        setXY(x, y);
    }

    public Ball() {}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return String.format("(%.3f; %.3f)", x, y);
    }
}