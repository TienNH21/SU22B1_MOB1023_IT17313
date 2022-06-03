package buoi2_lt1;

import java.io.Serializable;

public class Nguoi implements Serializable {
    private String hoTen;
    private int gioiTinh;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String xuatThongTin()
    {
        String gtStr = "";
        
//        if (this.gioiTinh == 1) {
//            gtStr = "Nam";
//        } else {
//            gtStr = "Nữ";
//        }
        
        gtStr = (this.gioiTinh == 1) ? "Nam" : "Nữ";
        
        return this.hoTen + " - " + this.diaChi + " - " + gtStr;
    }
}
