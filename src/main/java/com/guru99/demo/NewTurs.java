package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTurs {
    public static void main(String[] args){
        //Establemce la ruta del ejecutable de ChromeDriver
        // webdriver.chrome.driver: es la clave que le indica a selenium que driver utilizar
        //./src/main/resources/driver/chromedriver.exe: ruta relativa del ejecutable
        System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");

        //Crea una instancia de chromeDriver, lo que abre una ventana del navegador
        //WebDriver es la interfaz que maneja la automatizacion.
        WebDriver webDriver = new ChromeDriver();

        //Maximiza la ventana del navegador
        webDriver.manage().window().maximize();

        //Abre la pagina
        webDriver.get("https://demo.guru99.com/test/newtours/");

        //Buscar el campo User Name, utilizando el atributo "Name" y escribe en el campo.
        webDriver.findElement(By.name("userName")).sendKeys("admin123");
        webDriver.findElement(By.name("password")).sendKeys("admin1234");

        //Dar click
        webDriver.findElement(By.name("submit")).click();
        // Simuñar un enter
        //webDriver.findElement(By.name("submit")).sendKeys(Keys.ENTER);

        //Obtiener el texto del resultado obtenido
        String restutado = webDriver.findElement(By.xpath("//h3[contains(text(), 'Login Successfully')]")).getText();
        System.out.println(restutado);

        //Cierra la ventana del navegador y finaliza el proceso.
        webDriver.quit();

    }
}
