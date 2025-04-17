import java.util.Scanner;
public class exercice1 {
public static int Lecture() {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
        System.out.print("donner un entier strictement positif : ");
        while (!sc.hasNextInt()) {
            System.out.print("ne pas un entier entrer un autre entier: ");
            sc.next();
        }n= sc.nextInt();
    } while (n <= 0);
    return n;
}public static int Compter(int n) {
    int comp = 0;
    while (n > 0) {
        comp=comp+1;
        n /= 10;
    }
    return comp;
}
public static void main(String[] args) {
    int n = Lecture();
    int chiffres = Compter(n);
    System.out.println("Le nbr des chiffres et : " + chiffres);
}
} 