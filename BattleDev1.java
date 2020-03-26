/*******
 * Read input from System.in
 * Use: System.out.println to ouput your result to STDOUT.
 * Use: System.err.println to ouput debugging information to STDERR.
 * ***/
package com.isograd.exercise;
import java.util.*;

public class BattleDev1 {


public static void main( String[] argv ) throws Exception {
		String  line;
        Scanner sc = new Scanner(System.in);
        int nbPersonnes = sc.nextInt();
        String[] couleur = new String[nbPersonnes];
        for (int i = 0; i < nbPersonnes; i++) {
            couleur[i] = sc.nextLine();
        }
    
        int nbJaune= 0;
        int nbRouge = 0;
        int nbRose = 0;
        int nbOrange = 0;
        int nbVert = 0;
        int nbViolet = 0;
        int nbBleu = 0;

        
        for (int i = 0; i < nbPersonnes; i++) {
            switch (couleur[i]) {

                case "jaune": nbJaune++;
                break;

                case "rouge": nbRouge++;
                break;

                case "rose": nbRose++;
                break;

                case "orange": nbOrange++;
                break;

                case "vert": nbVert++;
                break;

                case "violet": nbViolet++;
                break;

                case "bleu": nbBleu++;
				break;
                
			} 	
        }

        int[] tableCouleur = {nbJaune, nbRouge, nbRose, nbOrange, nbVert, nbViolet, nbBleu};

		int max = - 1;
		String colorMax = "";
		if (tableCouleur[0] > max) {
			colorMax = "jaune";
			max = tableCouleur[0];
		}
		if (tableCouleur[1] > max) {
			colorMax = "rouge";
			max = tableCouleur[1];
		}
		if (tableCouleur[2] > max) {
			colorMax = "rose";
			max = tableCouleur[2];
		}
		if (tableCouleur[3] > max) {
			colorMax = "orange";
			max = tableCouleur[3];
		}
		if (tableCouleur[4] > max) {
			colorMax = "vert";
			max = tableCouleur[4];
		}
		if (tableCouleur[5] > max) {
			colorMax = "violet";
			max = tableCouleur[5];
		}
		if (tableCouleur[6] > max) {
			colorMax = "bleu";
			max = tableCouleur[6];
		}

		int max2 = - 1;
		String colorMax2 = "";
		if (tableCouleur[0] > max2 && "jaune" != colorMax) {
			colorMax2 = "jaune";
			max2 = tableCouleur[0];
		}
		if (tableCouleur[1] > max2 && "rouge" != colorMax) {
			colorMax2 = "rouge";
			max2 = tableCouleur[1];
		}
		if (tableCouleur[2] > max2 && "rose" != colorMax) {
			colorMax2 = "rose";
			max2 = tableCouleur[2];
		}
		if (tableCouleur[3] > max2 && "orange" != colorMax) {
			colorMax2 = "orange";
			max2 = tableCouleur[3];
		}
		if (tableCouleur[4] > max2 && "vert" != colorMax) {
			colorMax2 = "vert";
			max2 = tableCouleur[4];
		}
		if (tableCouleur[5] > max2 && "violet" != colorMax) {
			colorMax2 = "violet";
			max2 = tableCouleur[5];
		}
		if (tableCouleur[6] > max2 && "bleu" != colorMax) {
			colorMax2 = "bleu";
			max2 = tableCouleur[6];
		}
	
        Arrays.sort(tableCouleur);

        System.out.println(colorMax + " " + colorMax2);


    }
}