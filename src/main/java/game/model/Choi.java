/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.model;

/**
 *
 * @author lqv20
 */
public class Choi extends VuKhi{
    private double sucmanhphepthuat;
    private double tocdobay;  

    public Choi(double sucmanhphepthuat, double tocdobay) {
        this.sucmanhphepthuat = sucmanhphepthuat;
        this.tocdobay = tocdobay;
    }

    public double getSucmanhphepthuat() {
        return sucmanhphepthuat;
    }

    public void setSucmanhphepthuat(double sucmanhphepthuat) {
        this.sucmanhphepthuat = sucmanhphepthuat;
    }

    public double getTocdobay() {
        return tocdobay;
    }

    public void setTocdobay(double tocdobay) {
        this.tocdobay = tocdobay;
    }

    @Override
    public String toString() {
        return "Choi{" + "sucmanhphepthuat=" + sucmanhphepthuat + ", tocdobay=" + tocdobay + '}';
    }    
    
    @Override
    public double tinhSucTanCong() {
        return this.sucmanhphepthuat*this.tocdobay;
    }
    
    
    
    
    
}
