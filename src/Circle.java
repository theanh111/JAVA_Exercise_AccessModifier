public class Circle {
    private double radius = 1.0;
    private String color = "red";

    protected Circle(){
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
