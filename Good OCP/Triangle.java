public  class Triangle extends Shape {
    public int height;
    public int base;

    /*Area of Triangle = ½(b × h)*/

    Triangle(int height,int base){
        this.height=height;
        this.base=base;
    }
    @Override
    double Area() {

        return 0.5*this.height * this.base;
    }
}
