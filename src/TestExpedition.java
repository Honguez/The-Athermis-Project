public class TestExpedition {
    public static void main(String[] args) {
        Expedition e1 = new Expedition("Expedition 1",  7+(int)(Math.random() * ( 12 - 7 )));
        System.out.println("Le niveau de difficulté est de " + e1.difficulte);
    }
}
