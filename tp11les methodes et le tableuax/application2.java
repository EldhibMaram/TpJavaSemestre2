import java.util.Scanner;
public class application2 {
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrez le nombre d'élèves (>=10) : ");
            n = sc.nextInt();
        } while (n < 10);
        return n;
    }
    
    public static void RemplirTAb(double[] T, Scanner sc) {
        for (int i = 0; i < T.length; i++) {
            double note;
            do {
                System.out.print("Note de l'élève " + (i + 1) + " (0-20) : ");
                note = sc.nextDouble();
            } while (note < 0 || note > 20);
            T[i] = note;
        }
    }
    
    public static double Calcul_Moy(double[] T) {
        double somme = 0;
        for (double note : T) {
            somme += note;
        }
        return somme / T.length;
    }
    
    public static int NombreNote(double[] T, double moyenne) {
        int count = 0;
        for (double note : T) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN(sc);
        double[] notes = new double[n];
        RemplirTAb(notes, sc);
        double moyenne = Calcul_Moy(notes);
        int nbSuperieures = NombreNote(notes, moyenne);
        System.out.printf("La moyenne de la classe est :", moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne : " + nbSuperieures);
        sc.close();
    }
} 

