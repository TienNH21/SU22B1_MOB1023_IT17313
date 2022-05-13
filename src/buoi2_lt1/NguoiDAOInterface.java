/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_lt1;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public interface NguoiDAOInterface {
    public void insert(Nguoi n);
    public void update(int viTri, Nguoi n);
    public void delete(int viTri);
    public ArrayList<Nguoi> getList();
    public Nguoi getById(int viTri);
}
