package com.kt.cucumber.stepdefs;

import com.kt.TlApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TlApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
