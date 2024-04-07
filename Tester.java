class Tester {
    private Circle[] circles;
    private int n;

    public Tester(Circle[] circles) {
        this.circles = circles;
        n = circles.length;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public int getN() {
        return n;
    }
}

class Parent {
    public Parent(String test, int v) {
        System.out.println(test);
        var t = new int[v];
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child");
    }
}

class Circle {
    private final Point center;
    private double radius;

    public Circle() {
        center = new Point();
        radius = 1;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        setRadius(radius);
    }

    public void setRadius(double radius) throws RuntimeException {
        if (radius < 0) {
            throw new RuntimeException("Radius should be greater then 0.");
        }
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}

class Point {
    private double x;
    private double y;

    public Point() {}

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

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
}