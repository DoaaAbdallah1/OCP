public class AreaShape {
    Shape s;
    AreaShape(Shape s){
        this.s=s;
    }

    public void areaShape(Shape s) {
        if (s.m_type==1)
            areaRectangle((Rectangle) s);
        else if (s.m_type==2)
            areaCircle((Circle) s);
        else if (s.m_type==3)
            areaTriangle((Triangle) s);
    }
    public double areaCircle(Circle r) {
        double x=3.14;
      return (x)* r.radius * r.radius;
    }

    public double areaRectangle(Rectangle r) {

        return r.width*r.height;
    }
    public double areaTriangle(Triangle r) {
        double result=r.height*r.base*0.5;

        return result;
    }


}
