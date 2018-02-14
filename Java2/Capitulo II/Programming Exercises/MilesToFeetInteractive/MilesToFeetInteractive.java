/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestofeetinteractive;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class MilesToFeetInteractive {

    public static void main(String[] args) {
        Scanner mb=new Scanner(System.in);
        float mai=5280,hp;
        hp=mb.nextFloat();
        System.out.printf("La distancia es de: %.2f millas y/o %.2f pies\n", hp,mai*hp);
    }
}