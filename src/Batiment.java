public class Batiment {
    String nom;
    int nbColon;
    boolean isSurface;
    int capacite;
    int[] emplacementDes;

    protected Batiment(String nom,boolean isSurface, int capacite){
        this. nom = nom;
        nbColon = 0;
        this.isSurface = isSurface;
        this.capacite = capacite;
        if(isSurface) {
            emplacementDes = new int[1];
        }
    }

    protected void ajouterColon(){
        System.out.println(("Nb colon " + nbColon));
        if(nbColon == capacite) System.out.println("Impossible d'ajouter de colon, limite atteinte");
        else {
            nbColon += 1;
            System.out.println(("Un colon a été ajouté"));
            System.out.println(("Nb colon " + nbColon));
        }
    }

    protected void retirerColon(){
        if(nbColon == 0) System.out.println("Operation impossible, il n'y pas de colon à retirer");
        else {
            nbColon -= 1;
            System.out.println(("Un colon a été retiré"));
        }
    }

    protected void deplacerColon(Batiment bat){
        if(bat.nbColon < bat.capacite){
            if(this.nbColon > 0){
                this.retirerColon();
                bat.ajouterColon();
            }
            else{
                System.out.println("Operation impossible, il n'y pas de colon à retirer");
            }
        }else{
            System.out.println("Opération impossible, il n'y a plus de place pour ajouter un colon");
        }
    }

    protected void activation(){
        if (nbColon == capacite){
            obtentionRecompense();
        }else{
            System.out.println("Il n'y a pas assez de colons");
        }
    }

    protected void obtentionRecompense(){
        System.out.println("Recompense obtenue");
    }

    protected void encherir(int resultatDe) {
        if (isSurface) {
            if (this.emplacementDes[0] == 0 || this.emplacementDes[0] < resultatDe) {
                this.emplacementDes[0] = resultatDe;
                System.out.println("Le dé a été ajouté");
            }else{
                System.out.println("Le dé n'a pas été ajouté");
            }
        }else {
                System.out.println("Ce bâtiment n'a pas d'emplacement de dé");
        }
    }
}

