public class Rectangle extends Shape{
    public int width;
    public int height;
    Rectangle(int width,int height){
        this.width=width;
        this.height=height;

    }
        @Override
    double Area() {
        return this.width*this.height;
    }
}
