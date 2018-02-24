/*
 * Aquest programa calcula la hipotenusa donats dos catets.
 * Els catets es llegeixen dels arguments del programa.
 */
package nf2.recursivitat;

public class Hipotenusa {
   
    public static void main(String[] args) {
        double c1 = Double.parseDouble(args[0]);
        double c2 = Double.parseDouble(args[1]);
        double h = hipotenusa(c1, c2);
        System.out.println(h);
    }
    
    public static double hipotenusa(double c1, double c2) {
        double c1al2 = quadrat(c1);
        double c2al2 = quadrat(c2);
        double h = Math.sqrt(c1al2 + c2al2);
        return h;
    }
    
    public static double quadrat(double c) {
        double calc = c * c;
        return calc;
    }
}
