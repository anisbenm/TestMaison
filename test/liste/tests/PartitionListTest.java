/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste.tests;

import liste.util.ListUtil;
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
        liste=Arrays.asList(1,'a',2,'b',3.4,'c');
        int taille = 4;

        List result = ListUtil.partition(liste, taille);

        // assertion
        List l = Arrays.asList(1,'a', 2, 'b');
        List l1 = Arrays.asList(3.4, 'c');

        List expResult = new ArrayList();
        expResult = Arrays.asList(l, l1);
        assertEquals(expResult, result);

    }
    @Test
    public void testPartition1() {

        //Création et découpage de la liste
        System.out.println("partition");
        List liste = new ArrayList<>();
        for (Integer i = 1; i < 8; i++) {
            liste.add(i);
        }
        int taille = 2;

        List result = ListUtil.partition(liste, taille);

        // assertion
        List l = Arrays.asList(1, 2);
        List l1 = Arrays.asList(3, 4);
        List l2 = Arrays.asList(5, 6);
        List l3 = Arrays.asList(7);

        List expResult = new ArrayList();
        expResult = Arrays.asList(l, l1, l2, l3);
        assertEquals(expResult, result);

    }

    /**
     * Test 2 of partition method, of class PartitionList.
     */
    @Test
    public void testPartition2() {

        //Création et découpage de la liste
        System.out.println("partition");
        List liste = new ArrayList<>();
        for (Integer i = 1; i < 8; i++) {
            liste.add(i);
        }
        int taille = 3;

        List result = ListUtil.partition(liste, taille);

        // assertion
        List l = Arrays.asList(1, 2, 3);
        List l1 = Arrays.asList(4, 5, 6);
        List l3 = Arrays.asList(7);

        List expResult = new ArrayList();
        expResult = Arrays.asList(l, l1, l3);
        assertEquals(expResult, result);

    }

    /**
     * Test of partition method, of class PartitionList.
     */
    @Test
    public void testTailleSupSize() {

        //Création et découpage de la liste
        System.out.println("partition");
        List liste = new ArrayList<>();
        for (Integer i = 1; i < 8; i++) {
            liste.add(i);
        }
        int taille = 10;

        List result = ListUtil.partition(liste, taille);

        // assertion
        List expResult = new ArrayList();
        expResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assertEquals(expResult, result);

    }

    @Test
    public void testTailleZero() {

        //Création et découpage de la liste
        System.out.println("partition");
        List liste = new ArrayList<>();
        for (Integer i = 1; i < 8; i++) {
            liste.add(i);
        }
        int taille = 0;

        List result = ListUtil.partition(liste, taille);

        // assertion
        List expResult = new ArrayList();
        expResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assertEquals(expResult, result);

    }

    @Test
    public void testListNull() {

        //Création et découpage de la liste
        System.out.println("partition");
        List liste = new ArrayList<>();
        int taille = 3;

        List result = ListUtil.partition(liste, taille);

        // assertion
        List expResult = new ArrayList();
        assertEquals(expResult, result);

    }
}
