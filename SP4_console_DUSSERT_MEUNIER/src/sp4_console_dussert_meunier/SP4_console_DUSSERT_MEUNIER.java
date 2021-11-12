/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_dussert_meunier;

/**
 *
 * @author dusse
 */
public class SP4_console_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Le jeu met en sc\u00e8ne deux joueurs qui s\u2019affrontent autours d\u2019une grille de jeu de 6 lignes par 7
                           colonnes pour un total de 42 cellules.
                           Pr\u00e9paration de la partie : Lors de la pr\u00e9paration de la partie, un des joueurs se voit assigner
                           une couleur al\u00e9atoire parmi Rouge ou Jaune. L\u2019autre joueur se voit assigner l\u2019autre couleur.
                           Chaque joueur se voit remettre 21 jetons de la couleur qui lui a \u00e9t\u00e9 assign\u00e9e. On tire une couleur
                           al\u00e9atoire parmi jaune et rouge ; le joueur associ\u00e9 \u00e0 cette couleur sera le premier joueur.
                           D\u00e9roulement de la partie : A tour de r\u00f4le, chaque joueur choisit une colonne de la grille et y
                           glisse un jeton de sa couleur, qui descend jusqu\u2019\u00e0 atteindre la ligne la plus basse non occup\u00e9e.
                           Si l\u2019ajout de ce nouveau jeton ne produit pas un alignement de quatre jetons ou plus de la m\u00eame
                           couleur, on passe au joueur suivant et ainsi de suite.
                           Fin de partie : Le premier joueur qui arrive \u00e0 aligner au moins 4 jetons de sa couleur gagne la
                           partie et remporte une victoire. Si aucun joueur n\u2019arrive \u00e0 aligner 4 jetons lorsque la grille de
                           jeu est remplie, la partie se termine sur un match nul.""");
        System.out.println("Présence de trous noirs\n" +
        "En début de partie, 5 trous noirs sont positionnés aléatoirement sur des cases de la grille de jeu\n" +
        "et sont visibles. Lorsqu’un jeton est joué et s’arrête sur une case contenant un trou noir, alors le\n" +
        "Jeton est absorbé par le trou noir et disparait. Le trou noir disparaît également mais le joueur\n" +
        "courant ne peut plus jouer pour ce tour.\n" +
        "Récupération de ses jetons\n" +
        "Durant son tour de jeu, un joueur peut choisir de ne pas jouer de jeton, mais de récupérer à la\n" +
        "place un jeton de sa couleur. Cette action entrainera un décalage de tous les jetons de la même\n" +
        "colonne situés au-dessus du jeton récupéré d’une ligne vers le bas. Cette action peut apporter\n" +
        "immédiatement la victoire ou la défaite : la nouvelle configuration de la grille est analysée, et\n" +
        "si un alignement de quatre jetons ou plus se produit pour un seul joueur uniquement, ce dernier\n" +
        "remporte la partie. Si les deux joueurs se retrouvent chacun avec quatre jetons alignés ou plus,\n" +
        "alors le joueur étant à l’origine de la récupération de jeton perd immédiatement pour avoir\n" +
        "provoqué une faute de jeu.\n" +
        "Désintégration de jetons adverses\n" +
        "En début de partie sont positionnés aléatoirement 5 désintégrateurs, dont 2 sur des cases\n" +
        "occupées par des trous noirs. Les 2 désintégrateurs positionnés sur les cases à trou noir ne sont\n" +
        "pas visibles, car cachés derrière les trous noirs. Les autres désintégrateurs sont visibles. Le\n" +
        "premier joueur qui positionne un de ses jetons sur une case occupée par un désintégrateur le\n" +
        "remporte. Chaque joueur a un nombre de désintégrateurs, initialisé à zéro en début de partie,\n" +
        "qui se voit augmenter d’une unité lorsqu’il remporte un désintégrateur. Lorsqu’un joueur \n" +
        "dispose d’un désintégrateur, il peut choisir à tout moment de l’utiliser pendant son tour de jeu\n" +
        "au lieu de jouer un Jeton. Un désintégrateur se joue uniquement sur un jeton adverse déjà\n" +
        "positionné, et désintègre celui-ci. Le jeton désintégré explose en particules subatomiques et est\n" +
        "définitivement perdu. . Cette action entrainera un décalage de tous les jetons de la même\n" +
        "colonne situés au-dessus du jeton récupéré d’une ligne vers le bas Cette action peut apporter\n" +
        "immédiatement la victoire ou la défaite : la nouvelle configuration de la grille est analysée, et\n" +
        "si un alignement de quatre jetons ou plus se produit pour un seul joueur uniquement, ce dernier\n" +
        "remporte la partie. Si les deux joueurs se retrouvent chacun avec quatre jetons alignés ou plus,\n" +
        "alors le joueur étant à l’origine de la désintégration de jeton perd immédiatement pour avoir\n" +
        "provoqué une faute de jeu.\n" +
        "A noter que si un désintégrateur était caché derrière un trou noir, le désintégrateur est remporté\n" +
        "lorsque le joueur positionne son jeton sur le trou noir, en même temps que le trou noir est détruit. ");
        
        
    }
     
    
}
