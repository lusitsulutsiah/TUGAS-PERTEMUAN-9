/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg11;

/**
 *
 * @author LENOVO G40
 */
public class Latihan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 345674;
       int iMinus = -1;
       System.out.println("i : " + i);
       System.out.printf("%%d : %d%n", i);
       System.out.printf("%%l0d : %l0d%n", i);
       System.out.printf("%%+l0d : %+l0d%n", i);
       System.out.printf("%%+l0d : %+l0d%n", iMinus);
       System.out.printf("%%,l0d : %,l0d%n", i);
       System.out.printf("%%-l0d : %-l0d%n", i);
       double f = 5675482.982;
       System.out.println("f : " + f);
       System.out.printf("%%f : %f%n", f);
       System.out.printf("%%.2f : %.2f%n", f);
       System.out.printf("%%l2.2f : %l2.2f%n", f);
       System.out.printf("%%,l2.2f : %,l2.2f%n", f);
  }
}
