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
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee=uneCellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        setIcon(im_vide);
    }
}
