/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Model {
    private String nik;
    private String nama;
    private String div;
    private boolean karyawan;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public boolean isKaryawan() {
        return karyawan;
    }

    public void setKaryawan(boolean karyawan) {
        this.karyawan = karyawan;
    }
    
    public Model(String nik, String nama, String div, boolean karyawan){
        this.nik = nik;
        this.nama = nama;
        this.div = div;
        this.karyawan = karyawan;
    }
}