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
public class TesBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku2 aku= new Buku2();
        
        aku.setJudulbuku("Java");
        aku.setPengarang("Abdul");
        aku.setHarga(40000);
        aku.setJumlah(5);
        aku.cetak();
        aku.hargabuku();
        aku.hargadiskon();
        
    }
    
}
