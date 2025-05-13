
plugins {
    id("java") // Se usa el plugin de Java para gestionar el proyecto
}

// Configuración del grupo y la versión del proyecto
group = "com.guru99.demo" // Define el nombre del grupo del proyecto
version = "1.0-SNAPSHOT" // Indica que esta es una versión en desarrollo (snapshot)

// Definición de repositorios
repositories {
    mavenCentral() // Usa el repositorio de Maven Central para obtener dependencias
}

// Declaración de dependencias necesarias
dependencies {
    // Agrega Selenium como dependencia para la automatización de pruebas en navegadores
    // Esta versión corresponde a la versión más reciente compatible con tu proyecto
    implementation("org.seleniumhq.selenium:selenium-java:4.32.0")
    // Importa la biblioteca de Cucumber para pruebas de comportamiento (BDD) en Java
    implementation("io.cucumber:cucumber-java:7.22.1")
}

// Configuración de la ejecución de pruebas
tasks.test {
    useJUnitPlatform() // Se usa JUnit Platform para ejecutar pruebas unitarias
}
