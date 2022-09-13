package ngay_7_ke_thua;

public class Animal {
    private String name;
    private int age = 20;
    private String gender;
    private float weight;

    public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("ăn cỏ");
    }
    public void run(){
        System.out.println("chạy bằng 4 chân");
    }
    public void say(){
        System.out.println("gâu gâu");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
