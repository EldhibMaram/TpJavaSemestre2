import java.util.Scanner;

public class methodes {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("entrez un entier strictement positif");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur: L'entier doit etre strictement positif");
            }
        } while (n <= 0);
        return n;
    }
    public static boolean EstPair(int n) {
        return n % 2 == 0;
    }
    public static int compter(int n) {
        int nbr =0;
        while ((n!=0)) {
            nbr++;
            n=n/10;
        }
        return nbr;
}
public static int calculeSomme(int n) {
    int somme = 0;
    for (int i = 1; i <= n; i++) {
        somme += i * i;
        return s;
    }}
    
}
