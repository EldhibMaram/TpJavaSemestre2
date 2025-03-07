import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verbe;
        do {
            System.out.println("donner un verbe de 1ere groupe");
            verbe = sc.nextLine();

        } while (!verbe.endsWith("er"));
        if (verbe.equals("aller")) {
            System.out.println("donner un autre verbe de 1ere groupe");
            verbe = sc.nextLine();
        }

        System.out.println("je " + verbe.replace("er", "e"));
        System.out.println("tu " + verbe.replace("er", "es"));
        System.out.println("il/elle " + verbe.replace("er", "e"));

        if (verbe.equals("manger") || verbe.equals("commencer")) {
            System.out.println("nous " + verbe.replace("er", "eons"));
            System.out.println("nous " + verbe.replace("cer", "çons"));
        } else {
            System.out.println("nous " + verbe.replace("er", "ons"));
            System.out.println("nous " + verbe.replace("er", "ons"));
        }
        System.out.println("vous " + verbe.replace("er", "ez"));
        System.out.println("Ils/Elles " + verbe.replace("er", "ent"));

        sc.close();
    }
}