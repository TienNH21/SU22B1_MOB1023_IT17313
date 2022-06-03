package buoi11_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "file_io_stream.txt";
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
        try {
            FileInputStream fis = new FileInputStream(filename);
            byte[] b = new byte[10];
            fis.read(b);
            
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Không ghi được vào file");
            e.printStackTrace();
        }
    }
    
    public static void ghiFile(String filename) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(filename);
            String msg = "Hello Poly";
            byte[] b = msg.getBytes();
            fos.write(b);
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Không ghi được vào file");
            e.printStackTrace();
        }
    }
}
