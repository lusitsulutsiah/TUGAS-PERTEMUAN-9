/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;

/**
 *
 * @author LENOVO G40
 */
public class LATIHAN4 {
    
    public void tambahKambing () {
        // Deklarasi varisbel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println ("Jumlah Kambing setelah ditambah: " + 
                jumlahKambing);
        
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing ();
        kambingJantan.tambahKambing ();
    }
}
