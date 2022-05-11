package buoi2_lt1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyDanhSach qlds = new QuanLyDanhSach();
        
        while (true) {
            MainClass.menu();
            
            int chon = Integer.parseInt( sc.nextLine() );
            
            if (chon == 0) {
                break;
            }
            
            switch (chon) {
                case 1:
                    // Thêm mới
                    System.out.println("Nhập tên:");
                    String ten = sc.nextLine();
                    System.out.println("Nhập giới tính (1 - Nam, 0 - Nữ):");
                    int gt = Integer.parseInt( sc.nextLine() );
                    System.out.println("Nhập địa chỉ:");
                    String diaChi = sc.nextLine();
                    
                    Nguoi n = new Nguoi(ten, gt, diaChi);
                    qlds.them(n);
                    break;

                case 2:
                    // Xuất ds
                    qlds.xuatDanhSach();
                    break;

                case 3:
                    qlds.sinhVien();
                    break;

                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }
    
    public static void menu() {
        System.out.println("-------------------");
        System.out.println("Nhập:");
        System.out.println("\t1. Thêm mới đối tượng");
        System.out.println("\t2. Xuất danh sách");
        System.out.println("\t3. Sinh viên");
        System.out.println("\t0. Dừng chương trình");
        System.out.println("-------------------");
    }
}
