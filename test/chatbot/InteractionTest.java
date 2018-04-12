/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author russell
 */
public class InteractionTest {
    
    public InteractionTest() {
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
     * Test of starterPrompt method, of class Interaction.
     */
    @Test
    public void testStarterPrompt() {
        System.out.println("starterPrompt");
        Interaction instance = new Interaction();
        instance.starterPrompt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResponse method, of class Interaction.
     */
    @Test
    public void testGetResponse() {
        System.out.println("getResponse");
        String input = "";
        Interaction instance = new Interaction();
        instance.getResponse(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeather method, of class Interaction.
     */
    @Test
    public void testGetWeather() {
        System.out.println("getWeather");
        Interaction instance = new Interaction();
        String expResult = "";
        String result = instance.getWeather();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCold method, of class Interaction.
     */
    @Test
    public void testGetCold() {
        System.out.println("getCold");
        Interaction instance = new Interaction();
        String expResult = "";
        String result = instance.getCold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMild method, of class Interaction.
     */
    @Test
    public void testGetMild() {
        System.out.println("getMild");
        Interaction instance = new Interaction();
        String expResult = "";
        String result = instance.getMild();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHot method, of class Interaction.
     */
    @Test
    public void testGetHot() {
        System.out.println("getHot");
        Interaction instance = new Interaction();
        String expResult = "";
        String result = instance.getHot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Interaction.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        String expResult = "";
        String result = Interaction.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Interaction.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Interaction instance = new Interaction();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSass method, of class Interaction.
     */
    @Test
    public void testGetSass() {
        System.out.println("getSass");
        Interaction instance = new Interaction();
        instance.getSass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
