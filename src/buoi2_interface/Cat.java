package buoi2_interface;

public class Cat implements Animal {
    @Override
    public void an()
    {
        System.out.println("Ăn cơm, cá, chuột, gà ...");
    }
    
    @Override
    public void diChuyen()
    {
        System.out.println("Chạy");
    }
    
    @Override
    public void tiengKeu()
    {
        System.out.println("Moew");
    }
}
