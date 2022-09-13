package ngay_7_ke_thua;
import java.util.Arrays;
import java.util.Scanner;
public class mang_so{
    public static void main(String[] args) {
int[] num = new int[]{1,2,3,4,5,6,8,9};
Scanner scanner = new Scanner(System.in);
System.out.println("------quan ly so------");
System.out.println("1.hiển thị mảng");
System.out.println("2.thêm phần tử");
System.out.println("3.sửa phần tử");
System.out.println("4.xóa phần tử");
System.out.println("5.thoát");
int jav = Integer.parseInt(scanner.nextLine());
switch (jav){
    case 1:
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        break;
    case 2:
        System.out.println("nhập số cần thêm: ");
        int a = scanner.nextInt();
        int[] arrNew = new int[num.length +1];
        for (int i = 0; i < num.length; i++) {
            arrNew[i] = num[i];
        }
        arrNew[arrNew.length -1] = a;
        num = arrNew;
        System.out.println(Arrays.toString(num));
        break;
    case 3:
        System.out.println("nhập vị trí cần sửa");
        int index = scanner.nextInt();
        System.out.println("nhập số cần sửa");
        int value = scanner.nextInt();
        num[index] = value;
        System.out.println(Arrays.toString(num));
        break;
    case 4:
        System.out.println("nhập vị trí cần xóa");
        int[] array = new int[num.length - 1];
        int vitri = 0;
        int vitricanxoa = scanner.nextInt();
        for (int i = 0; i < num.length; i++) {
            if(i != vitricanxoa){
                array[vitri] = num[i];
                vitri++;
            }

        }
        System.out.println(Arrays.toString(array));
      }
    }
  }
