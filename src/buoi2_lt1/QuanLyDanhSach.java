package buoi2_lt1;

import java.util.ArrayList;

public class QuanLyDanhSach implements NguoiDAOInterface {
    private ArrayList<Nguoi> ds;

    public QuanLyDanhSach() {
        this.ds = new ArrayList<Nguoi>();
    }
    
    @Override
    public void insert(Nguoi n) {
        this.ds.add(n);
    }
    
    @Override
    public ArrayList<Nguoi> getList() {
        return this.ds;
    }

    @Override
    public void update(int viTri, Nguoi n) {
        this.ds.set(viTri, n);
    }

    @Override
    public void delete(int viTri) {
        this.ds.remove(viTri);
    }

    @Override
    public Nguoi getById(int viTri) {
        return this.ds.get(viTri);
    }
    
}
