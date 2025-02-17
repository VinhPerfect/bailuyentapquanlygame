/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lqv20
 */
public class DoiQuan {
    private int maquandoan;
    private List<BinhDoan> dsbd;

    public DoiQuan(int maquandoan) {
        this.maquandoan = maquandoan;
        this.dsbd = new ArrayList<BinhDoan>();
    }

    public int getMaquandoan() {
        return maquandoan;
    }

    public void setMaquandoan(int maquandoan) {
        this.maquandoan = maquandoan;
    }

    public List<BinhDoan> getDsbd() {
        return dsbd;
    }

    public void setDsbd(List<BinhDoan> dsbd) {
        this.dsbd = dsbd;
    }
    
    public void addBinhDoan(BinhDoan bd){
        dsbd.add(bd);
    }

    @Override
    public String toString() {
        return "DoiQuan{" + "maquandoan=" + maquandoan + ", dsbd=" + dsbd + '}';
    }   
}
