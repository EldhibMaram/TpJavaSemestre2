import java.util.Scanner;
public class exercice2 {
        public static double addition(double a, double b) {
            return a + b;
        }
        public static double soustraction(double a, double b) {
            return a - b;
        }
        public static double multiplication(double a, double b) {
            return a * b;
        }
        public static double division(double a, double b) {
            if (b == 0) {
                System.out.println("Erreur!");
                return 0;
            }
            return a / b;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choisissez une opération (+, -, *, /) : ");
            char operation = scanner.next().charAt(0);
            System.out.print("saisir  le 1ere nombre : ");
            double a = scanner.nextDouble();
            System.out.print("saisir le 2eme nombre : ");
            double b = scanner.nextDouble();
            double res= 0;
            switch (operation) {
                case '+': res = addition(a, b); break;
                case '-': res = soustraction(a, b); break;
                case '*': res = multiplication(a, b); break;
                case '/': res = division(a, b); break;
                default:
                    System.out.println("Opération pas valide.");
                    return;
            }
            System.out.println("Résultat : " + res);
        }
    } 
    
   

