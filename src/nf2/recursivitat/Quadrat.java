/*
 * Aquest programa calcula el quadrat d'un nombre
 */
package nf2.recursivitat;

/**
 *
 * @author julian
 */
public class Quadrat {
    
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double nal2 = quadrat(n);
        System.out.println(nal2);
    }
    
    public static double quadrat(double n) {
        double calc = n * n;
        return calc;
    }
}
