package ngay_7_ke_thua;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Nhanvien[] themnv1 = new Nhanvien[3];
        themnv1[0] = new Nhanvien("vân", 23, "nam");
        themnv1[1] = new Nhanvien("an", 24, "nam");
        themnv1[2] = new Nhanvien("vinh", 25, "nam");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.hiển thị nhân viên");
        System.out.println("2.thêm thị nhân viên");
        System.out.println("3.xóa nhân viên");
        int so = scanner.nextInt();
        switch (so) {
            case 1:
                show(themnv1);
                break;
            case 2:
                add(themnv1);
                break;
            case 3:
        }
    }
    public static void show(Nhanvien[] themnv1) {
        for (Nhanvien nv : themnv1) {
            System.out.println(nv.toString());
        }
    }
    public static void add(Nhanvien[] themnv1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập gender");
        String gender = scanner.nextLine();
        System.out.println("nhập age");
        int age = scanner.nextInt();
        Nhanvien nhanvien = new Nhanvien(name, age, gender);
        System.out.println(nhanvien.toString());
        Nhanvien[] nvNew = new Nhanvien[themnv1.length + 1];
        for (int i = 0; i < themnv1.length; i++) {
            nvNew[i] = themnv1[i];
        }
        nvNew[nvNew.length - 1] = nhanvien;
    }
    public static void remove(String[] args){

    }
}