package buoi2_lt1;

import java.util.ArrayList;

public class QuanLyDanhSach {
    private ArrayList<Nguoi> ds;
    
    public QuanLyDanhSach() {
        this.ds = new ArrayList<Nguoi>();
    }
    
    public void them(Nguoi n) {
        this.ds.add(n);
    }
    
    public void xuatDanhSach() {
//        for (int i = 0; i <ds.size(); i++) {
//            Nguoi n = this.ds.get(i);
//            System.out.println(n.xuatThongTin());
//        }

        for (Nguoi n: ds) {
            System.out.println(n.xuatThongTin());
        }
    }
    
    public void sinhVien() {
        Nguoi sv = new SinhVien("PH1", "UD", "Ng Van A", 1, "HN");
        this.ds.add(sv);
        System.out.println( sv.xuatThongTin() );
        System.out.println( ( (SinhVien) sv ).getChuyenNganh() );
    }
}
