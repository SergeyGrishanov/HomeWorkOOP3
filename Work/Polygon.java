public abstract class Polygon extends Figure implements IPerimetr{
    private double[] sides;

    protected Polygon(double[] sides){
        this.sides = sides;
        for(double side: this.sides){
            if (side <= 0) throw new IllegalArgumentException("Сторона не может быть отрицательным числом!");
        }
        
    }

    public double findPerimetr(){
        double perimetr = 0;
        for(double side: this.sides){
            perimetr+=side;
        }
        return perimetr;
    }
    public double[] getSides(){
        return this.sides;
    }
    
}