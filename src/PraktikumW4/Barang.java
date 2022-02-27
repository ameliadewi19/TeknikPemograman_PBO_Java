/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumW4;

/**
 *
 * @author User
 */
public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    public String getKodeBarang(){
        return this.kode_barang;
    }
    
    public String getNamaBarang(){
        return this.nama_barang;
    }
    
    public int getStok(){
        return this.stok;
    }
    
    public void addBarang(int n){
        this.stok += n;
    }
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}