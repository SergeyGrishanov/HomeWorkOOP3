public class Circle extends Figure implements ILengthCircle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
        if (this.radius <= 0) throw new IllegalArgumentException("Радиус не может быть отрицательным числом");
    }

    @Override
    public double figeraA() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double findLength(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return String.format("Радиус: %s", this.radius);
    }

    
}