import java.util.Scanner;
public class exercice2 {
    public static String tab( String [][]M ){
        Scanner sc=new Scanner(System.in);
        String[][] M= new String[][];
        String[][]M={{"numvol","vdep","vdest","codeav","classav","prixvol"}
        ,{"1","tozeur","djerba","ab01","a1","156"},{"2","tozeur","tunis","ab02","a2","250"},
        {"3","tunis","djerba","ab03","a1","140"},{"4","djerba","sfax","ab04","a2","120"}};
    public static String afficher(String ch){
        String ch,lettre;
        
        do{
            System.out.println("donner la premier lettre ");
            lettre=sc.nextLine();
        }while(ch.indexOf(ch:0)&&(ch.equals(ch)));
        {System.out.println("afficher les donner de vols selon la premier lettre");}
    }
    public static int remise(int prix){
        System.out.println("donner le prix");
        prix=sc.nextInt();
        while(prix=prix*0,2){
            System.out.println("afficher les vols apres le remise"+prix);
        }
    }
    public static void main(String[] args) {
    String tab( String [][]M );
    static int remise(int prix);
    }
}}
