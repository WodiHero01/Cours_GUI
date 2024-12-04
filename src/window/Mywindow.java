package window;

import javax.swing.*;
import java.awt.*;
import Event.*;


public class Mywindow extends JFrame {

    private JLabel labelA;
    private JCheckBox checkBoxA;

    public Mywindow() {
        super();        // Pas necessaire si rien dans ()
        super.setTitle("My First Window");  // Titre
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Action pour fermer la JFrame

        checkBoxA = new JCheckBox("Selection");
        //checkBoxA.setText("Selection"); // pas nécessaire peut-être compacter
        super.getContentPane().add(checkBoxA); // Conteneur pas nécessaire, car pas dans un panel

        JButton buttA = new JButton("Apply"); //Bouton
        checkBoxA.addActionListener(new ButtonListener(this) {}); // Nécessaire pour faire un lien avec l'event
        labelA = new JLabel();   // Texte COURS
        this.labelA.setText("No action available");

        super.setLayout(new FlowLayout()); //Permet de ranger les objets à la suite
        JPanel panelRight = new JPanel();
        panelRight.add(buttA);
        panelRight.add(labelA);
        panelRight.setLayout(new GridLayout(2,1));
        super.getContentPane().add(panelRight);


        super.pack(); // Afficher à la taille du contenu
        super.setVisible(true);
    }

    public boolean getStateCheckBox(){
        return checkBoxA.isSelected();
    }

    public void setTextLabel(String text){
        labelA.setText(text);
    }


    public static void main(String[] args) {
        Mywindow window = new Mywindow();

    }
}
