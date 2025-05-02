public class exercice6 {
    public static int maxtableau(int[] tableau)  {
        if ((tableau.length==0)) {
            throw new IllegalArgumentException("un tableau vide na pas de maximum");
        }
        int max =tableau[0];
        for(int i=1;i<tableau.length;i++){
            if (tableau[i]>max) {
                max=tableau[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]t=//{1 , 2, 5, 89 , 75, 10};//{};
        {8};
        System.out.println(maxtableau(t));
    }
}
