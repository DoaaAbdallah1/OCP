// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(7);
        Rectangle c2=new Rectangle(2,6);
        Triangle c3=new Triangle(2,4);

        AreaShape A1= new AreaShape(c1);
        AreaShape A3= new AreaShape(c2);
        AreaShape A2= new AreaShape(c3);
        System.out.println("Bad OCP");
        System.out.println("Area Circle : "+ A1.areaCircle(c1));
        System.out.println("Area Rectangle : "+ A1.areaRectangle(c2));
        System.out.println("Area Triangle : "+ A1.areaTriangle(c3));



    }
}