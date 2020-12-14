import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dès{

    Random rand = new Random();
    int face;
    int noJoueur;
    int x, y;
    

    public Dès(){
        this.face = 1;
        this.noJoueur = 1;
    }

    public Dès(int face, int noJoueur){
        this.face = face;
        this.noJoueur = noJoueur;
    }

    public void RollDès(){
        this.face = rand.nextInt(7);
    }

    public void PlacementDèsTest(){
        JFrame frame = new JFrame("JLabel Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        String imgUrl= "image dès/" + this.face + "," + this.noJoueur + ".png";
        ImageIcon dèsIcon = new ImageIcon(imgUrl);

        //Création de JLable avec un alignement gauche
        JLabel jlabel = new JLabel(dèsIcon, JLabel.CENTER);

        //ajouter les deux JLabel a JFrame
        frame.getContentPane().add(jlabel);
        frame.validate();
    }

    public JLabel PlacementDès(int x, int y){
        String imgUrl= "image dès/" + this.face + "," + this.noJoueur + ".png";
        ImageIcon dèsIcon = new ImageIcon(imgUrl);

        //Création de JLable avec un alignement gauche
        JLabel jlabel = new JLabel(dèsIcon);
        jlabel.setBounds(x, y, 100, 100);
        return jlabel;
    }

    public JLabel PlacementDès(){
        String imgUrl= "image dès/" + this.face + "," + this.noJoueur + ".png";
        ImageIcon dèsIcon = new ImageIcon(imgUrl);

        //Création de JLable avec un alignement gauche
        JLabel jlabel = new JLabel(dèsIcon);
        return jlabel;
    }

}