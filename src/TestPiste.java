
public class TestPiste {

    public static void main(String[] args) {
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();
        j1.setPosPisteSecours(5);
        j2.setPosPisteSecours(4);
        System.out.println(j1.getPosPisteSecours());

        //j1.compensation();
        j1.choixRecompense();
        j2.choixRecompense();
    }

}
