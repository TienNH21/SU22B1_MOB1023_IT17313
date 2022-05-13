package buoi2_lt1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NguoiDAOInterface qlds = new QuanLyDanhSach();
        
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
                    qlds.insert(n);
                    break;

                case 2:
                    ArrayList<Nguoi> ds = qlds.getList();
                    for (Nguoi n1: ds) {
                        System.out.println(n1.xuatThongTin());
                    }
                    break;

                case 3:
//                    qlds.sinhVien();
                    Nguoi sv = new SinhVien("PH1", "UD", "Ng Van A", 1, "HN");
                    qlds.insert(sv);
                    System.out.println( sv.xuatThongTin() );
                    System.out.println( ( (SinhVien) sv ).getChuyenNganh() );
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
