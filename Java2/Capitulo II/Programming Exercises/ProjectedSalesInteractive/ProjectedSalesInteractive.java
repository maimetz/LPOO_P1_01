/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsalesinteractive;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class ProjectedSalesInteractive {

    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        float Perce=(float).10,a,b;
        float sur,norte;
        a=ab.nextFloat();
        b=ab.nextFloat();

        System.out.printf("El incremento del sur: %.2f Incremento de norte: %.2f \n", a*Perce,b*Perce);
    }
}