import javax.swing.JFrame;

public class TestDès {

    public static void main(String[] args) {
        // Dès d1 = new Dès(5,1);
        // d1.PlacementDèsTest();


        JFrame frame = new JFrame("Remplacement du plateau");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        Dès j13 = new Dès(3,1); // Creation du dès numero 3 du joueur 1
        Dès j23 = new Dès(2,2);// Creation du dès numero 2 du joueur 2

        frame.add(j13.PlacementDès());
        frame.add(j23.PlacementDès(2));

        frame.validate();
    }
}