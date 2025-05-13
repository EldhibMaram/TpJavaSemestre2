import java.util.Scanner;

public class application3 {
    
    
    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Veuillez entrer un entier strictement positif : ");
            n = scanner.nextInt();
        } while (n <= 0);
        
        return n;
    }

    
    public static boolean estPremier_rec(int n, int diviseur) {
        if (n < 2) {
            return false;
        }
        if (diviseur == 1) {
            return true;
        }
        if (n % diviseur == 0) {
            return false;
        }
        return estPremier_rec(n, diviseur - 1);
    }

    public static void main(String[] args) {
        int nombre = lecture();
        boolean estPremier = estPremier_rec(nombre, nombre - 1);
        System.out.println("Le nombre " + nombre + " est " + (estPremier ? "premier" : "non premier") + ".");
    }
}
