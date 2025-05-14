# Automatización de Pruebas con Selenium y Java

## Descripción General

Este proyecto permite automatizar pruebas de inicio de sesión en la página [Guru99 Newtours](https://demo.guru99.com/test/newtours/index.php) 
utilizando **Selenium** para la interacción con el navegador.

## Estructura del Proyecto

El proyecto está compuesto por los siguientes elementos:

- **`build.gradle.kts`**: Define dependencias y configuración del proyecto.
- **`src/main/java/com/guru99/demo/Newtours.java`**: Código principal para la automatización.
- **`chromedriver.exe`**: Controlador necesario para interactuar con el navegador Google Chrome.

## Configuración y Dependencias

Las principales dependencias utilizadas en el proyecto son:

```kotlin
dependencies {
    // Selenium: para la automatización del navegador
    implementation("org.seleniumhq.selenium:selenium-java:4.32.0")
}
