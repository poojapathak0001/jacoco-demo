package org.trial.jacoco_demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    public void testApp()
    {
    	App a = new App();
    	assertEquals(8,a.add(4,4));
    }
}
