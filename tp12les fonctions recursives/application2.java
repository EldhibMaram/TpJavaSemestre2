import java.util.Scanner;

public class application2{
    
    
    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Veuillez entrer un entier strictement positif : ");
            n = scanner.nextInt();
        } while (n <= 0);
        
        return n;
    }

    
    public static long factoriel_rec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factoriel_rec(n - 1);
        }
    }

    public static void main(String[] args) {
        int nombre = lecture();
        long result = factoriel_rec(nombre);
        System.out.println("Le factoriel de " + nombre + " est : " + result);
    }
}
