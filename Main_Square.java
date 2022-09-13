package ngay_7_ke_thua;

public class Main_Square {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println(square);

        square = new Square(9.9);
        System.out.println(square);

        square = new Square(8.8,"blue",true);
        System.out.println(square);
    }
}
