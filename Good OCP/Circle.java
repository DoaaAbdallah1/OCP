public class Circle extends Shape{
    public int radius;
    Circle(int radius){
        this.radius=radius;
    }
    @Override
    double Area() {
        double pi=22/7;
        return pi*this.radius*this.radius;
    }
}
