/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmaison.exercice;

import testmaison.util.ListUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anis BEN MOUSSA
 */
public class PartitionListTest {

   
    /**
     * Test of partition method, of class PartitionList.
     */
    @Test
    public void testPartition() {
        
        //Création et découpage de la liste
        System.out.println("partition");
        List liste = new ArrayList<>();
        for (Integer i = 1; i < 8; i++) {
            liste.add(i);
        }
        int taille = 2;
        
        List result = ListUtil.partition(liste, taille);
        
        // assertion
        List expResult = new ArrayList();
        List l= Arrays.asList(1,2);
        List l1= Arrays.asList(3,4);
        List l2= Arrays.asList(5,6);
        List l3= Arrays.asList(7);
        expResult.add(l);
        expResult.add(l1);
        expResult.add(l2);
        expResult.add(l3);
        assertEquals(expResult, result);
        
    }

}
