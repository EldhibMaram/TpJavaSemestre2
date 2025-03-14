import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=methodes.lectureN(sc);
        int nbr =methodes.compter(n);
        System.out.println("L'entier " + n+ " contient " + nbr + " chiffres.");
}
}