package buoi1_oop_review;

public class MainClass {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Ng Van A", 0, "PH12345");
        
        System.out.println(sv.getTen());
        System.out.println(sv.getTuoi());
        System.out.println(sv.getMaSv());
        
//        sv.ten = "ABC";
//        sv.tuoi = -1;
//        sv.maSv = "";
//        
//        System.out.println(sv.ten);
//        System.out.println(sv.tuoi);
//        System.out.println(sv.maSv);
    }
}
