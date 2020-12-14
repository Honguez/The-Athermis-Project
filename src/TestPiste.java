
public class TestPiste {

    public static void main(String[] args) {
        Joueur j1 = new Joueur();
        j1.setPosPisteSecours(5);
        System.out.println(j1.getPosPisteSecours());

        //j1.compensation();
        j1.choixRecompense();
    }

}
