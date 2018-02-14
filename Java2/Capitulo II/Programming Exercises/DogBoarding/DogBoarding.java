/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogboarding;
import java.util.Scanner;

/**
 *
 * @author metz_
 */
public class DogBoarding {

    public static void main(String[] args) {
        
        Scanner pe=new Scanner(System.in);
        System.out.print("Peso del perro: ");
        
        int prro=pe.nextInt();
        System.out.print("Cuantos dias se va a quedar: ");
        
        int hg=pe.nextInt();
        double peso=.50;
        double cant=(prro*peso)*hg;
        
        System.out.printf("Total embarque: %.2f\n", cant);
        
    }
}