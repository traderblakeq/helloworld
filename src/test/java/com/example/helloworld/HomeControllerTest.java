package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    //Vi tester udenfor Spring context:
    private HomeController homeController = new HomeController();

    @Test
    public void home() {
        assertEquals("index", homeController.home());

    }
}