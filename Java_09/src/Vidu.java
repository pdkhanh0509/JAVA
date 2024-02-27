import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        // Khai báo biến để đọc dữ liệu
        Scanner sc = new Scanner(System.in);

        // Một số ví dụ
        System.out.println("Nhap vao ho va ten: ");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhap ma sinh vien: ");
        long maSV = sc.nextLong();

        System.out.println("Nhap vao diem thi: ");
        float diemThi = sc.nextFloat();

        System.out.println("------");
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Diem thi: " + diemThi);
    }
}
