/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class Eggs {

    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        System.out.println("Cuantos huevos se van a pedir?:\t");
        int sb = a.nextInt();
        int pa = sb/12;
        int d = 12*pa;
        int cp = sb-d;
        double f = ( (pa*3.25) + (cp*0.45) );
        System.out.printf("Huevos: %d.. Son %d docenas y %d unidades, Precio: $ %.2f\n",sb,pa,cp,f);
    }
}