/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeetinteractive;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class InchesToFeetInteractive {

    public static void main(String[] args) {
         Scanner ab=new Scanner(System.in);
        float hg;
        float sb;
        hg=ab.nextFloat();
        sb= (float) (hg/(11.94444444));
        System.out.printf("Pulgadas: %.2f\t\tPies: %f\n",hg,sb);
    }
}