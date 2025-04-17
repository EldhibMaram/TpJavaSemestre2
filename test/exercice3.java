import java.util.Scanner;
public class exercice3 {
    public static boolean estInf(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }
    public static String Groupe(String verbe) {
        String x = "";
        if (verbe.equals("aller")) 
        {x="3e groupe";}
        if (verbe.equals("faire")) 
        {x="3e groupe";}
        if (verbe.equals("savoir")) 
        {x="3e groupe";}
        if (verbe.equals("sortir")) 
        {x="3e groupe";}
        else if (verbe.endsWith("er"))
         {x="1er groupe";}
        else if (verbe.endsWith("ir"))
         {x="2e groupe (si participe présent en -issant)";}
        return x;
    }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe;
        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = scanner.nextLine().trim().toLowerCase();
            if (!estInf(verbe)) {
                System.out.println("Ce verbe n'est pas à l'infinitif. Réessayez.");
            }
        } while (!estInf(verbe));
        String groupe = Groupe(verbe);
        System.out.println("Le verbe \"" + verbe + "\" appartient au " + groupe);
    }
} 
