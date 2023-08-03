import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CollectionFigures {
    public  ArrayList<Figure> allFigure = new ArrayList<>();
    {
        allFigure.add(new Rectangle(2, 6));
        allFigure.add(new Triangle(5, 6, 7));
        allFigure.add(new Circle(8));
    }

    public int getSize(){
        return allFigure.size();
    }

    public void showAll(){
        int counter = 1;
        for(Figure figure: allFigure){
            System.out.printf("%d. %s: , %s ", counter, figure.getClass().getSimpleName(), figure.toString());
            if (figure instanceof IPerimetr){
                System.out.printf("Периметр: %.1f, ", ((IPerimetr)figure).findPerimetr());
            }
            if (figure instanceof ILengthCircle){
                System.out.printf("Длинна: %.1f, ", ((ILengthCircle)figure).findLength());
            }
            System.out.printf("Площадь: %.1f \n", figure.figeraA()); 
            System.out.println("-----------------------------------------------------");
            counter++;
        }
    }

   
    public Figure addCircle(Scanner sc){
        System.out.println("Введите радиус: ");
        double radius = sc.nextDouble();
        return (new Circle(radius));
    }
    public Figure addRectangle(Scanner sc){
        System.out.println("Введите длинну прямоуголника: ");
        double length = sc.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double weigth = sc.nextDouble();
        return (new Rectangle(length, weigth));
    }
    public Figure addTriangle(Scanner sc){
        System.out.println("Введите стороны треугольника: ");
        System.out.println("Введите сторону А: ");
        double sideA = sc.nextDouble();
        System.out.println("Введите сторону В: ");
        double sideB = sc.nextDouble();
        System.out.println("Введите сторону С: ");
        double sideC = sc.nextDouble();
        return (new Triangle(sideA, sideB, sideC));
    }
    public void addFigure(Scanner sc){
        System.out.println("1. Прямоугольник");
        System.out.println("2. Треугольник");
        System.out.println("3. Круг");
        System.out.println("Выберите номер фигуры!:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                this.allFigure.add(addRectangle(sc));
                break;
            case 2:
                this.allFigure.add(addTriangle(sc));
                break;
            case 3:
                this.allFigure.add(addCircle(sc));
                break;
        }
    }
    public void removeFigure(int num){
        if(num < allFigure.size()) this.allFigure.remove(num);
    }

    public void changeFigure(int num, Scanner sc){
        if (num < this.allFigure.size()) {
            System.out.println("1. Прямоугольник");
            System.out.println("2. Треугольник");
            System.out.println("3. Круг");
            System.out.println("Выберите номер фигуры для измерения");
            int numberFigure = sc.nextInt();
            Figure newFigure = new Circle(1);
            switch(numberFigure){
                case 1: 
                newFigure = addRectangle(sc);
                break;
                case 2: 
                newFigure = addTriangle(sc);
                break;
                case 3: 
                newFigure = addCircle(sc);
                break;
            }
            this.allFigure.set(num, newFigure);
        }
    }
    public void sortOfArea(){
        Comparator<Figure> byArea = Comparator.comparing(Figure::figeraA);
        this.allFigure.sort(byArea);
    }

}