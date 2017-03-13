/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOL_DIMAS_MAWARDI;

/**
 *
 * @author Dimas
 */
public class Buku2 extends Buku{
    public int hargabayar;
    
    
    public void hargabuku(){
       hargabayar=Harga*Jumlah;
        System.out.println("Harga total\t : "+hargabayar);
    }
    
    public void hargadiskon(){
        int hargadiskon;
        if(hargabayar>=100000 && hargabayar<200000){
            System.out.println("Selamat anda mendapat diskon 10% ");
            hargadiskon=hargabayar*10/100;
            hargabayar=hargabayar-hargadiskon;
            System.out.println("Harga setelah di diskon : "+hargabayar);
        }else if(hargabayar>=200000){
            System.out.println("Selamat anda mendapat diskon 15% ");
            hargadiskon=hargabayar*15/100;  
            hargabayar=hargabayar-hargadiskon;
            System.out.println("Harga setelah di diskon : "+hargabayar);
        }
        
    }

    
}
