package com.isograd.exercise;
import java.util.*;

public class BattleDev2 {

    public static void main( String[] argv ) throws Exception {

        Scanner sc = new Scanner(System.in);

        int nbTirages = sc.nextInt();

        int nbMax = 0;

        int [] chiffres = new int [nbTirages];
        for (int i = 0; i < nbTirages; i++) {

            chiffres[i] = sc.nextInt();
        }

        int count = 1;

        for (int i = 1; i < nbTirages; i++) {

            int D = chiffres[i - 1];
            if( chiffres[i] == D ) {

            count++;
            } else {

                nbMax = Math.max(nbMax,count);
                    D = chiffres[i];
                    count = 1;
            }
            if (i == nbTirages - 1) {

                if (chiffres[i] == chiffres[i-1]) {

                    nbMax = Math.max(nbMax,count);
                }
            }
        }
        System.out.println(nbMax);
    }
}
