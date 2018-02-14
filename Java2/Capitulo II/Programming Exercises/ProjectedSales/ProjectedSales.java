/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsales;

/**
 *
 * @author metz_
 */
public class ProjectedSales {

    public static void main(String[] args) {
        float mai=(float).10,p,c;
        float sb=560,mb=823;
        p=sb*mai;
        c=mb*mai;
        System.out.printf("El estado del sur tendra un incremento de %.2f y el norte un incremento de %.2f en realcion a sus ventas\n", p,c);
    }
}