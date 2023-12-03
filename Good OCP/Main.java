
public class Main {
    public static void main(String[] args) {
        System.out.println("Good OCP");
        Shape R1=new Rectangle(4,6);
        System.out.println("Print Area Rectangle : "+R1.Area());
        Shape C1=new Circle(3);
        System.out.println("Print Area Circle : "+C1.Area());
        Shape T1=new Triangle(5,6);
        System.out.println("Print Area Triangle : "+T1.Area());

    }

}