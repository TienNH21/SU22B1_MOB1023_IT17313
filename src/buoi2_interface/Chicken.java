package buoi2_interface;

public class Chicken implements Animal {
    @Override
    public void an()
    {
        System.out.println("Thóc");
    }
    
    @Override
    public void diChuyen()
    {
        System.out.println("Chạy");
    }
    
    @Override
    public void tiengKeu()
    {
        System.out.println("Gáy ...");
    }
}
