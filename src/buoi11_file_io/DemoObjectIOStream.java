package buoi11_file_io;

import buoi2_lt1.SinhVien;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoObjectIOStream {
    public static void main(String[] args) {
        String filename = "file_object_stream.txt";
        System.out.println("------------------");
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
        System.out.println("------------------");
    }
    
    public static void docFile(String filename) {
        
    }
    
    public static void ghiFile(String filename) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            SinhVien sv = new SinhVien("PH1", "UDPM", "A", 1, "HN");
            oos.writeObject(sv);
            
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Không ghi được vào file");
            e.printStackTrace();
        }
    }
}
