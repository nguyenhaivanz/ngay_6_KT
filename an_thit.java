package ngay_7_ke_thua;

public class an_thit extends Animal{
private String loaithit;

public void disan(){
    super.eat();
    eat();
    System.out.println("rình mồi");
    run();
}
//    @Override
//    public void eat(){
//       super.eat();
//        System.out.println("ăn thịt");
//    }
    @Override
    public void eat(){
//    super.eat();
        System.out.println("ăn thịt");
    }
    }