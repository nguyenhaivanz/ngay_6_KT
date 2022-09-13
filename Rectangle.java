package ngay_7_ke_thua;

public class Rectangle extends Shape{
    private double width  = 10;
    public double lenght = 20;

    public Rectangle(){
    }
    public Rectangle(double width,double lenght){
        this.width = width;
        this.lenght = lenght;
    }
    Rectangle(double width, double lenght, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
            return width * this.lenght;
    }
    public double getPerimeter(){
        return 2 * (width + this.lenght);
    }
    @Override
    public String toString(){
        return "chiều rộng = " + getWidth() + " chiều dài " + getLenght() + ",lớp con " + super.toString();
    }
}

