package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 7/29/16.
 */
public class HelloWorldControllerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetGreeting() throws Exception {
        HelloWorldController controller = new HelloWorldController();
        assertEquals("hello world", controller.getGreeting());
    }
}