/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner fa=new Scanner(System.in);
        double pa;
        double me=fa.nextInt();
        pa=((me-32)*(0.5555555556));
        System.out.printf("Farenheit: %.2f\t\tCelsius: %.2f\n",me,pa);
    } 
}
