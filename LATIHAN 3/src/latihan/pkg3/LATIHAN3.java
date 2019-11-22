/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3;

import java.util.Scanner;

/**
 *
 * @author Lusi Tsulutsiah Nur Faridoh
 */
public class LATIHAN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.print("Masukkan nama anda:");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next ();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
