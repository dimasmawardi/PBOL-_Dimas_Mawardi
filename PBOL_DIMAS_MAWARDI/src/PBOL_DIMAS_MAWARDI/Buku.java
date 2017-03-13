package PBOL_DIMAS_MAWARDI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas
 */
public class Buku {
    public String Judul_buku;
    public String Pengarang;
    protected int Harga;
    protected int Jumlah;
    
    public void setJudulbuku(String Judul_buku){
        this.Judul_buku=Judul_buku;
    }
    public String getJudulbuku(){
        return Judul_buku;
    }
     
    public void setPengarang(String Pengarang){
        this.Pengarang=Pengarang;
    }
    public String getPengarang(){
        return Pengarang;
    }
    
    public void setHarga(int Harga){
        this.Harga=Harga;
    }
    public int getHarga(){
        return Harga;
    } 
     
    public void setJumlah(int Jumlah){
        this.Jumlah=Jumlah;
    }
    public int getJumlah(){
        return Jumlah;
    }
    
    public void cetak(){
        System.out.println("Judul Buku \t : "+Judul_buku);
        System.out.println("Pengarang \t : "+Pengarang);
        System.out.println("Harga \t\t : "+Harga);
        System.out.println("Jumlah Buku \t : "+Jumlah);
    }

   
}
