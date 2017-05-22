/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmaison.exercice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anis BEN MOUSSA
 */
public class PartitionList {

    public List partition(List liste, int taille) {
        List l = new ArrayList();
        int nbListC = liste.size() / taille;
//        int longLastList = liste.size() % taille;
        int index = 0;
        List sousListe = new ArrayList();
        for (int i = 0; i < nbListC; i++) {
            for (int j = 0; j < taille; j++) {
                sousListe.add(liste.get(index));
                index++;
            }
            l.add(sousListe);
        }
        sousListe.clear();
        for(;index<liste.size();index++){
            sousListe.add(liste.get(index));
        }
        l.add(sousListe); 
        return l;
    }
}
