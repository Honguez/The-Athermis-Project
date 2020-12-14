import javax.swing.*;
import java.awt.event.*;

public class AfficheExpedition {

    public static void main(String[] args) {
        int nbJoueurs = 6;
        JFrame f = new JFrame("Création Expedition");
        f.setSize(700,700);

        JButton creerExp = new JButton("Creer expedition");
        creerExp.setBounds(0,0,150,30);
        creerExp.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                JLabel nomExpLabel, difExpLabel;

                for(int i=0; i<nbJoueurs; i++) {

                    Expedition ei = new Expedition("Expedition" + i, 7 + (int) (Math.random() * (13 - 7)));

                    nomExpLabel = new JLabel(ei.nom);
                    nomExpLabel.setBounds(100, 50+i*25, 100, 30);

                    difExpLabel = new JLabel("Ce expedition a un niveau de difficulte de : " + ei.difficulte);
                    difExpLabel.setBounds(100, 60+i*25, 300, 30);

                    f.add(nomExpLabel);
                    f.add(difExpLabel);
                }

            }
        });

        f.add(creerExp);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
