/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_dussert_meunier;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.ImageIcon;
/**
 *
 * @author dusse
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    ImageIcon im_vide = new javax.swing.ImageIcon(getClass().getResource("/image/celluleVide.png"));
    ImageIcon im_desint = new javax.swing.ImageIcon(getClass().getResource("/image/desintegrateur.png"));
    ImageIcon im_jJaune = new javax.swing.ImageIcon(getClass().getResource("/image/jetonJaune.png"));
    ImageIcon im_jRouge = new javax.swing.ImageIcon(getClass().getResource("/image/jetonRouge.png"));
    ImageIcon im_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/image/trouNoir.png"));
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee=uneCellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        if (celluleAssociee.présenceDésintégrateur()==true&&celluleAssociee.présenceTrouNoir()==true){
            setIcon(im_trouNoir);
        }
        else if (celluleAssociee.présenceTrouNoir()==true){
            setIcon(im_trouNoir);
        }
        else if (celluleAssociee.présenceDésintégrateur()==true){
            setIcon(im_desint);
        }
        else if (celluleAssociee.lireCouleurDuJeton()=="jaune"){
            setIcon(im_jJaune);
        }
        else if (celluleAssociee.lireCouleurDuJeton()=="rouge"){
            setIcon(im_jJaune);
        }
        else {
            setIcon(im_vide);
        }
    }
}
