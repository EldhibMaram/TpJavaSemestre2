import java.util.Scanner;
public class application1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String mot1,mot2,ch;
    int l1 , l2 , pos;
        StringBuffer texte;
        do{
            System.out.println("donner une chaine ne depose pas 50 caracterre");
            ch=sc.nextLine();
        }while(ch.length()>50);
        do{
            System.out.println("donner le mot1 ne depasse pas 10 caractere");
            mot1=sc.nextLine();
            System.out.println("donner le mot2 ne depasse pas 10 caractere");
            mot2=sc.nextLine();
        }while ((mot1.length()>10)||(mot2.length()>10)); 
            texte=new StringBuffer(ch);
            l1=mot1.length();
            l2=mot2.length();
            while (texte.indexOf(mot1)!=-1) {
                pos= texte.indexOf(mot1);
                texte= texte.delete(pos, pos+l1);
                texte=texte.insert(pos, mot2);
            }
            System.out.println(texte);
    }}
        
    
