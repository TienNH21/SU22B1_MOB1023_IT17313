package buoi1_oop_review;

public class SinhVien {
    private String ten;
    private int tuoi;
    private String maSv;

    public SinhVien(String ten, int tuoi, String maSv) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.maSv = maSv;
    }

    public SinhVien() {
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    
    
}
