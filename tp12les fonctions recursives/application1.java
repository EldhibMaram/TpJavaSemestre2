import java.util.Scanner;
public class application1 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("entrez un entier strictement positif");
            n = sc.nextInt();
            if (n >= 0) {
                System.out.println("Erreur: L'entier doit etre strictement positif");
            }
        } while (n >= 0);
        return n;
    }
    public static int somme_rec(int n){
        if(n<=1){
            return 1;
        }else{
            return n+ somme_rec(n-1);
            }
        }
        public static void main(String[] args) {
            int n=5;
            System.out.println("la somme de 1 a" + n +"est:"+somme_rec(n));
        }
    }
