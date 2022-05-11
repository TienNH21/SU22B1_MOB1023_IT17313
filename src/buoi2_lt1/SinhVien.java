package buoi2_lt1;

/*
 * Khi lớp con kế thừa lớp cha, đối tượng của lớp con cũng có kiểu của lớp cha.
 * => đối tượng của SinhVien cũng có thể có kiểu Nguoi
 */
public class SinhVien extends Nguoi {
    private String maSv;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String chuyenNganh, String hoTen, int gioiTinh, String diaChi) {
        super(hoTen, gioiTinh, diaChi);
        this.maSv = maSv;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    public String xuatThongTin() {
        return super.xuatThongTin() + " - " + this.maSv + " - " + this.chuyenNganh;
    }
}
