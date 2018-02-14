/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dollars;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class Dollars {

    public static void main (String[] args) {
        Scanner dl=new Scanner(System.in);
        int hg=dl.nextInt();
            if (hg>=20) {
               int a=hg/20;
               int b=a*20;
               hg=hg-b;
               System.out.printf("Billetes (20): %d\n",a);
               System.out.printf("%d\n",hg);
            }
            if (hg>=10 && hg<=20) {
                int d=hg/10;
                int e=d*10;
                hg=hg-e;
                System.out.printf("Billetes (10): %d\n",d);
                System.out.printf("%d\n",hg);
            }
            if (hg>=5 && hg<=10) {
                int f=hg/5;
                int g=f*5;
                hg=hg-g;
                System.out.printf("Billetes (5): %d\n",f);
                System.out.printf("%d\n",hg);
            }
            if (hg>=1 && hg<=5) {
                int h=hg/1;
                int i=h*1;
                hg=hg-i;
                System.out.printf("Billetes de 1: %d\n",h);
                System.out.printf("%d\n",hg);
            }
    }
}