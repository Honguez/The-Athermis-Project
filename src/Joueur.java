import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Joueur{
    final JFrame PopUp = new JFrame();
    final JFrame Selecteur = new JFrame();
    JButton okButton = new JButton("Ok");
    private int PosPisteSecours; // la place du pion

    public Joueur(){
        PosPisteSecours = 0;
    }


    public int getPosPisteSecours() {
        return PosPisteSecours;
    }

    public void setPosPisteSecours(int posPisteSecours) {
        PosPisteSecours = posPisteSecours;
    }

    public void compensation(){
        this.setPosPisteSecours(this.getPosPisteSecours()+1);

        PopUp.setLayout(new FlowLayout());
        JLabel Text = new JLabel("Votre position dans la piste a augmenter de 1");
        PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PopUp.setSize(300, 100);
        PopUp.setLocationRelativeTo(null);
        PopUp.add(Text);
        PopUp.add(okButton);
        PopUp.setVisible(true);
        okButton.addActionListener(e -> {
            PopUp.dispose();
        });
    }

    public void choixRecompense(){
        Selecteur.setLayout(new FlowLayout());
        Selecteur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Selecteur.setSize(400, 100);
        Selecteur.setLocationRelativeTo(null);
        Selecteur.setVisible(true);

        if(this.PosPisteSecours == 0){
            return;
        }

        if(this.PosPisteSecours == 1){
            JButton nb1 = new JButton("1");
            JButton rien = new JButton("Aucune récompense");

            Selecteur.add(nb1);
            Selecteur.add(rien);

            nb1.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            rien.addActionListener(e -> {
                Selecteur.dispose();
            });
        }

        if(this.PosPisteSecours == 2){
            JButton nb1 = new JButton("1");
            JButton nb2 = new JButton("2");
            JButton rien = new JButton("Aucune récompense");

            Selecteur.add(nb1);
            Selecteur.add(nb2);
            Selecteur.add(rien);

            nb1.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb2.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            rien.addActionListener(e -> {
                Selecteur.dispose();
            });
        }

        if(this.PosPisteSecours == 3){
            JButton nb1 = new JButton("1");
            JButton nb2 = new JButton("2");
            JButton nb3 = new JButton("3");
            JButton rien = new JButton("Aucune récompense");

            Selecteur.add(nb1);
            Selecteur.add(nb2);
            Selecteur.add(nb3);
            Selecteur.add(rien);

            nb1.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb2.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb3.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            rien.addActionListener(e -> {
                Selecteur.dispose();
            });
        }
        if(this.PosPisteSecours == 4){
            JButton nb1 = new JButton("1");
            JButton nb2 = new JButton("2");
            JButton nb3 = new JButton("3");
            JButton nb4 = new JButton("4");
            JButton rien = new JButton("Aucune récompense");

            Selecteur.add(nb1);
            Selecteur.add(nb2);
            Selecteur.add(nb3);
            Selecteur.add(nb4);
            Selecteur.add(rien);

            nb1.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb2.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb3.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb4.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            rien.addActionListener(e -> {
                Selecteur.dispose();
            });
        }

        if(this.PosPisteSecours == 5){
            JButton nb1 = new JButton("1");
            JButton nb2 = new JButton("2");
            JButton nb3 = new JButton("3");
            JButton nb4 = new JButton("4");
            JButton nb5 = new JButton("5");
            JButton rien = new JButton("Aucune récompense");

            Selecteur.add(nb1);
            Selecteur.add(nb2);
            Selecteur.add(nb3);
            Selecteur.add(nb4);
            Selecteur.add(nb5);
            Selecteur.add(rien);

            nb1.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb2.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb3.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb4.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            nb5.addActionListener(e -> {
                //Ajoute de la récompense
                Selecteur.dispose();
                PopUp.setLayout(new FlowLayout());
                JLabel Text = new JLabel("Votre récompense a été ajouter");
                PopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PopUp.setSize(200, 100);
                PopUp.setLocationRelativeTo(null);
                PopUp.add(Text);
                PopUp.add(okButton);
                PopUp.setVisible(true);
                okButton.addActionListener(x -> {
                    PopUp.dispose();
                });
            });
            rien.addActionListener(e -> {
                Selecteur.dispose();
            });
        }
    }


}
