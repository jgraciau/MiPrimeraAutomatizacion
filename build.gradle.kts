plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Agrega Selenium como dependencia para la automatización de pruebas en navegadores
    // Esta versión corresponde a la versión más reciente compatible con tu proyecto
    implementation("org.seleniumhq.selenium:selenium-java:4.32.0")
}

tasks.test {
    useJUnitPlatform()
}