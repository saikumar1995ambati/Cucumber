package com.qa.sample;

import io.cucumber.java.Before;
import org.checkerframework.checker.nullness.qual.KeyFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    @Before
    public void login() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        FileReader file = new FileReader("C:\\Users\\ambat\\IdeaProjects\\SampleCucumber\\src\\test\\resources\\config.properties");
        Properties prop = new Properties();
        prop.load(file);




    }
}
