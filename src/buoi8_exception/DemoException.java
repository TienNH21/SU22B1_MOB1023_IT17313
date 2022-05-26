package buoi8_exception;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        try {
//            int i = Integer.parseInt(sc.nextLine());
//            System.out.println(i);
//            System.out.println("Xử lý thành công");
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            System.out.println("Vui lòng chỉ nhập số");
//        }
        
        String[] a = { "1", "2", "3", "a" };
        
        try {
            for(String s: a) {
                int i = Integer.parseInt(s);
                System.out.println(i);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Mảng a chưa được khởi tạo");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Truy cập phần tử ngoài phạm vi của mảng");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Giá trị không phải là số");
        } catch (Exception e) {
            //
        } finally {
            System.out.println("Xử lý xong");
        }
        
        System.out.println("Xử lý kết thúc");
    }
}
