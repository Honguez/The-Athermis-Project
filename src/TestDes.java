import javax.swing.JFrame;

public class TestDes {

    public static void main(String[] args) {
        // Dès d1 = new Dès(5,1);
        // d1.PlacementDèsTest();


        JFrame frame = new JFrame("Remplacement du plateau");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        Dès j1 = new Dès(3,1); // Creation du dès numero 3 du joueur 1
        Dès j2 = new Dès(2,2);// Creation du dès numero 2 du joueur 2
        Dès j3 = new Dès(4,3);
        Dès j4 = new Dès(6,4);
        Dès j5 = new Dès(1,5);

        frame.add(j1.PlacementDès(100,100));
        frame.add(j2.PlacementDès(150,100));
        frame.add(j3.PlacementDès(200,100));
        frame.add(j4.PlacementDès(250,100));
        frame.add(j5.PlacementDès(300,100));

        frame.validate();
    }
}