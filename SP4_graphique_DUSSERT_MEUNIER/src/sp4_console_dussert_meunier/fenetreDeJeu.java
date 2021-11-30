/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_dussert_meunier;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author dusse
 */
public class fenetreDeJeu extends javax.swing.JFrame {
    Joueur [] ListeJoueurs=new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneau_InfoJoueurs.setVisible(false);
        panneau_InfoPartie.setVisible(false);
        Grille grilleJeu=new Grille();
        
        for (int i=5;i>=0;i--){
            for (int j=0;j<7;j++){
                CelluleGraphique cellgraph=new CelluleGraphique(grilleJeu.cellulesJeu[i][j]);
                panneau_Grille.add(cellgraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_Grille = new javax.swing.JPanel();
        panneau_CréationPartie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_InfoJoueurs = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        panneau_InfoPartie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_jCourant = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_Grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_Grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_Grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 672, 576));

        panneau_CréationPartie.setBackground(new java.awt.Color(0, 204, 204));
        panneau_CréationPartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2:");
        panneau_CréationPartie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setText("Nom Joueur 1:");
        panneau_CréationPartie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nom_joueur2.setText("                                 ");
        panneau_CréationPartie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        nom_joueur1.setText("                                 ");
        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });
        panneau_CréationPartie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btn_start.setBackground(new java.awt.Color(255, 255, 255));
        btn_start.setText("PLAY");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_CréationPartie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, -1));

        getContentPane().add(panneau_CréationPartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 290, 130));

        panneau_InfoJoueurs.setBackground(new java.awt.Color(0, 204, 204));
        panneau_InfoJoueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Désintégrateurs :");
        panneau_InfoJoueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lbl_j1_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_j1_nom.setText("nomJoueur1");
        panneau_InfoJoueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        lbl_j1_desint.setText("nbDesintJoueur1");
        panneau_InfoJoueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Joueur 1:");
        panneau_InfoJoueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel8.setText("Couleur :");
        panneau_InfoJoueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lbl_j1_couleur.setText("couleurJoueur1");
        panneau_InfoJoueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panneau_InfoJoueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 150, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Joueur 2 :");
        panneau_InfoJoueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel10.setText("Couleur :");
        panneau_InfoJoueurs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setText("Désintégrateurs :");
        panneau_InfoJoueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lbl_j2_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_j2_nom.setText("nomJoueur1");
        panneau_InfoJoueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        lbl_j2_couleur.setText("couleurJoueur2");
        panneau_InfoJoueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        lbl_j2_desint.setText("nbDesintJoueur2");
        panneau_InfoJoueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Infos joueurs :");
        panneau_InfoJoueurs.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(panneau_InfoJoueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 290, 280));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btn_col_2.setText("3");
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        btn_col_3.setText("4");
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        btn_col_6.setText("7");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        btn_col_0.setText("1");
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        panneau_InfoPartie.setBackground(new java.awt.Color(0, 204, 204));
        panneau_InfoPartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Infos jeu :");
        panneau_InfoPartie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbl_jCourant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_jCourant.setText("nomJoueur1");
        panneau_InfoPartie.add(lbl_jCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Joueur courant :");
        panneau_InfoPartie.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        message.setBackground(new java.awt.Color(0, 204, 204));
        message.setColumns(20);
        message.setRows(5);
        jScrollPane2.setViewportView(message);

        panneau_InfoPartie.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        getContentPane().add(panneau_InfoPartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 290, 190));

        setBounds(0, 0, 1047, 678);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_InfoJoueurs.setVisible(true);
        panneau_InfoPartie.setVisible(true);
        initialisePartie();
        panneau_Grille.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }
        
    public void initialisePartie () {   
        Random rand= new Random();
        Grille grilleJeu =new Grille();
        String nomJoueur1=nom_joueur1.getText();
        String nomJoueur2=nom_joueur2.getText();
        Joueur J1 = new Joueur(nomJoueur1);
        Joueur J2 = new Joueur(nomJoueur2);
        ListeJoueurs[0]=J1;
        ListeJoueurs[1]=J2;
        int couleur=rand.nextInt(1);
        if (couleur==1){
            ListeJoueurs[0].Couleur="rouge";
            ListeJoueurs[1].Couleur="jaune";
        }
        else {
            ListeJoueurs[1].Couleur="rouge";
            ListeJoueurs[0].Couleur="jaune";
        }
        ListeJoueurs[0].ListeJetons=new Jeton[21]; 
        for (int i=0; i<21; i++){
            ListeJoueurs[0].ajouterJeton(new Jeton(J1.Couleur));
        }
        ListeJoueurs[1].ListeJetons=new Jeton[21];
        for (int i=0; i<21; i++){
            ListeJoueurs[1].ajouterJeton(new Jeton(J2.Couleur)); 
        }
        
        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);
        lbl_j1_couleur.setText(J1.Couleur);
        lbl_j2_couleur.setText(J2.Couleur);
        lbl_j1_desint.setText(J1.nombreDésintégrateur+"");
        lbl_j2_desint.setText(J2.nombreDésintégrateur+"");
        
        int l;
        int c;
//place trou noirs en début de partie
        int tabligneTrouNoirs[]=new int[5];
        int tabcolonneTrouNoirs[]=new int[5];
        for (int i=0;i<5;i++){
            l = rand.nextInt(6);
            c = rand.nextInt(5);
            while (grilleJeu.cellulesJeu[l][c].présenceTrouNoir()){
                l = rand.nextInt(6);
                c = rand.nextInt(5);
            }
            tabligneTrouNoirs[i]=l;
            tabcolonneTrouNoirs[i]=c;
            grilleJeu.placerTrouNoir(l,c);
        }
//place désintégrateurs
        for (int i=0;i<3;i++){
            l = rand.nextInt(6);
            c = rand.nextInt(5);
            while (grilleJeu.cellulesJeu[l][c].présenceTrouNoir()||grilleJeu.cellulesJeu[l][c].désintégrateur){
                l = rand.nextInt(6);
                c = rand.nextInt(5);
            }
            grilleJeu.placerDésintégrateur(l, c);
        }
        for (int i=0;i<2;i++){
            int p= rand.nextInt(4);
            l=tabligneTrouNoirs[p];
            c=tabcolonneTrouNoirs[p];
            grilleJeu.placerDésintégrateur(l, c);
        }
        int premierJ=rand.nextInt(1);
        joueurCourant=ListeJoueurs[premierJ];
        lbl_jCourant.setText(joueurCourant.Nom);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jCourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_CréationPartie;
    private javax.swing.JPanel panneau_Grille;
    private javax.swing.JPanel panneau_InfoJoueurs;
    private javax.swing.JPanel panneau_InfoPartie;
    // End of variables declaration//GEN-END:variables
}
