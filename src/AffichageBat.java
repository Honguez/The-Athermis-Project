import javax.swing.*;
import java.awt.event.*;

public class AffichageBat {

    public static void main(String[] args) {



        JFrame f = new JFrame("Contruction batiment");

        JButton construireBat=new JButton("Construire bâtiment");
        construireBat.setBounds(0,0,95,30);
        construireBat.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                JLabel nomBatLabel, nombreColonLabel, capaciteLabel;
                JButton ajouterColonButt, retirerColonButt, activationButt;

                Batiment bat1 = new Batiment("Batiment 1", false, 5);

                nomBatLabel = new JLabel(bat1.nom);
                nomBatLabel.setBounds(100, 50, 100,30);

                capaciteLabel = new JLabel("Ce batiment a une capacite d'accueil de : " + bat1.capacite);
                capaciteLabel.setBounds(100,100, 300, 30);

                nombreColonLabel = new JLabel("Il y a " + bat1.nbColon + " colon dans le bâtiment");
                nombreColonLabel.setBounds(100, 120, 200, 30);

                ajouterColonButt =  new JButton("Ajouter");
                ajouterColonButt.setBounds(100,200,100,30);
                ajouterColonButt.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        bat1.ajouterColon();
                        nombreColonLabel.setText("Il y a " + bat1.nbColon + " colon dans le bâtiment");
                    }
                });

                retirerColonButt = new JButton("Retirer");
                retirerColonButt.setBounds(200, 200, 100, 30);
                retirerColonButt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        bat1.retirerColon();
                        nombreColonLabel.setText("Il y a " + bat1.nbColon + " colon dans le bâtiment");
                    }
                });

                activationButt = new JButton("Activer");
                activationButt.setBounds(350,200, 100, 30);
                activationButt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if(bat1.activation()){
                            f.remove(ajouterColonButt);
                            f.remove(retirerColonButt);
                            f.remove(activationButt);
                            JLabel batimentActiveLabel = new JLabel("Batiment actif");
                            batimentActiveLabel.setBounds(100,200,100,30);
                            f.add(batimentActiveLabel);
                        }
                    }
                });

                f.add(nomBatLabel);
                f.add(capaciteLabel);
                f.add(nombreColonLabel);
                f.add(ajouterColonButt);
                f.add(retirerColonButt);
                f.add(activationButt);
                f.remove(construireBat);

            }
        });
        f.add(construireBat);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
