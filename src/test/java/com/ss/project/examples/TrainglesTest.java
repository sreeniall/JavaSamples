package com.ss.project.examples;

import com.ss.proj.examples.Traingles;
import javafx.scene.shape.TriangleMesh;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TrainglesTest {
    Traingles traingles;

    @Before
    public void config(){
         traingles = new Traingles();
    }


    @Test
    public void testTriangle(){
        boolean result = traingles.printTriangle();
        assertTrue(result);

    }

    @Test
    public void testSquear(){
        boolean result = traingles.printSquear();
        assertTrue(result);

    }

    @After
    public void clean(){
        traingles = null;
    }


}
