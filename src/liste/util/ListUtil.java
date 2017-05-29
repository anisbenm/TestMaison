/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste.util;

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
     * @return listeRes
     */
    public static List partition(List liste, int taille) {
        int size = liste.size();
        if (liste == null || taille <= 0 || taille >= size) {
            return liste;
        }
        List<List> listeRes = new ArrayList<>();
        int nbSousListes = size / taille;//sous listes complètes
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
        if (index < size) {
            sousListe = new ArrayList();
            for (; index < liste.size(); index++) {
                sousListe.add(liste.get(index));
            }
            listeRes.add(sousListe);
        }
        return listeRes;
    }
}
