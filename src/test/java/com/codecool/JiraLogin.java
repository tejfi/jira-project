package com.codecool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JiraLogin {
    private WebDriver driver;
    private String username;
    private String password;

    public JiraLogin(WebDriver driver, String username, String password) {
        this.driver = driver;
        this.username = username;
        this.password = password;
    }

    public void login() throws InterruptedException {
        driver.get("https://jira.codecool.codecanvas.hu/login.jsp");
        driver.findElement(By.id("login-form-username")).sendKeys(username);
        Thread.sleep(500);
        driver.findElement(By.id("login-form-password")).sendKeys(password);
        Thread.sleep(500);
        driver.findElement(By.id("login-form-submit")).click();
    }

    public void logout() throws InterruptedException {
        driver.findElement(By.id("header-details-user-fullname")).click();
        Thread.sleep(500);
        driver.findElement(By.id("log_out")).click();
        Thread.sleep(500);
    }

    public void setUser(String user) {
        this.username = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
