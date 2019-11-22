/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;

/**
 *
 * @author LENOVO G40
 */
class Kambing {
    public void tambahKambing () {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println ("Jumlah Kambing setelah ditambah: " + 
                           jumlahKambing);
 }
 public static void main (String [] args) {
     Kambing kambingJantan = new Kambing ();
     kambingJantan.tambahKambing();
 }   
    
}
