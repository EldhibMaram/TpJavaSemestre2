import java.util.Scanner;
public class exercice1 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("entrez un entier strictement positif");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur: Veuillez entrer un entier valide");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur: L'entier doit etre strictement positif");
            }
        } while (n <= 0);
        return n;

    }
    public static double sommetab(double[] t) {
        Scanner sc = new Scanner(System.in);
        double somme=0;
        for(double valeur:t){
            somme+=valeur;
        }
        return somme;
    }
    public static void incri(double[] tableau,double n){
        for(int i=0;i<tableau.length;i++){
            tableau[i]+=n;
        }
    }
    public static void affichertab(double[]t) {
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]+" ");
        }
            System.out.println();
    }
    public static void main(String[] args) {
        double[] montableau= {1.0 , 2.9 ,4.0 ,8.7};
        sommetab(montableau);
        double n=lectureN();
        incri(montableau, n);
        System.out.println("le tableau apres incrementation");
        affichertab(montableau);
        
    }
}

