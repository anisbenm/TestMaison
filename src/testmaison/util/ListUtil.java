/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmaison.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anis BEN MOUSSA
 */
public class ListUtil {

    /**
     * Découpe la liste passée en param en sous listes de maxi la taille passée
     * en param.
     *
     * @param liste
     * @param taille
     * @return
     */
    public static List partition(List liste, int taille) {

        List<List> listeRes = new ArrayList<>();
        int nbSousListes = liste.size() / taille;//sous listes complètes
        int index = 0;
        List sousListe;
        for (int i = 0; i < nbSousListes; i++) {
            sousListe = new ArrayList();
            for (int j = 0; j < taille; j++) {
                sousListe.add(liste.get(index));
                index++;
            }
            listeRes.add(sousListe);
        }

        // ajout de la dernière sous liste si nécessaire 
        if (liste.size() % taille != 0) {
            sousListe = new ArrayList();
            for (; index < liste.size(); index++) {
                sousListe.add(liste.get(index));
            }
            listeRes.add(sousListe);
        }
        return listeRes;
    }
}
