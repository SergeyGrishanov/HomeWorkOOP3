public class Rectangle extends Polygon{
    public Rectangle(double length, double weigth){
        super(new double[] {length, weigth, length, weigth});
    }

    public double figeraA(){
        return this.getSides()[0]*this.getSides()[1];
    }
    @Override
    public String toString() {
        return String.format("Длинна: %s, Ширина: %s", this.getSides()[0], this.getSides()[1]);
    }
}