import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void findAllPerimetr(ArrayList<Figure> figures){
        for(Figure figure: figures){
            if (figure instanceof IPerimetr){
                System.out.println(((IPerimetr)figure).findPerimetr());
            }
            if (figure instanceof ILengthCircle){
                System.out.println(((ILengthCircle)figure).findLength());
            }
        } 
    }
    public static void findAllArea(ArrayList<Figure> figures){
        for (Figure figure: figures){
            System.out.println(figure.figeraA());
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList<Figure> figures = new ArrayList<>();
        Figure rectangle1 = new Rectangle(5, 10);
        
        Figure triangle1 = new Triangle(3, 2, 2);
        Figure circle1 = new Circle(2);

        figures.add(rectangle1);
        figures.add(triangle1);
        figures.add(circle1);

        
        CollectionFigures allFigure1 = new CollectionFigures();
        
        allFigure1.showAll(); 

        Scanner sc = new Scanner(System.in);

        allFigure1.addFigure(sc); 
        System.out.println("New");
        allFigure1.showAll();

        allFigure1.removeFigure(2); 
        System.out.println("Remove");
        allFigure1.showAll();

        allFigure1.changeFigure(2, sc); 
        System.out.println("Отображение измерений: "); 
        allFigure1.showAll();

        System.out.println("Сортировака по площади: ");
        allFigure1.sortOfArea();
        allFigure1.showAll();


    }
}