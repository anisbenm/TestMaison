/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmaison.exercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user1
 */
public class PartitionListTest {

    public PartitionListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of partition method, of class PartitionList.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        List liste = new ArrayList<>();
        for (Integer i = 1; i < 8; i++) {
            liste.add(i);
        }

        int taille = 2;
        PartitionList instance = new PartitionList();
        List expResult = new ArrayList();
        List l=Arrays.asList({1,2});
        expResult.add(l);
        List result = instance.partition(liste, taille);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}
