package com.automation.stepDefinitions;

import com.automation.utilities.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver();  
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
