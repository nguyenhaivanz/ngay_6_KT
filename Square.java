package ngay_7_ke_thua;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(Double size) {
      super(size,size);
    }
    public Square(Double size, String color, boolean filled) {
        super(size,size,color,filled);
    }
    public double getsize(){
return getWidth();
    }
    public void setsize(double size){
        setWidth(size);
        setLenght(size);
    }
@Override
    public void setWidth(double size){
        setWidth(size);
}
@Override
    public void setLenght(double size){
        setLenght(size);
}
@Override
    public String toString(){
        return "cu to= " + getsize() + "nửa mét" + super.toString();
}
}