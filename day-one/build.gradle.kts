plugins {
    kotlin("jvm") version "2.0.21"
    application
}

application {
    mainClass.set("com.aok.vilp.MainKt")  // Fully qualified main class name
}

group = "com.aok.vilp"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

// tasks.register<JavaExec>("run") {
//     mainClass.set("com.aok.vilp.Main")
//     classpath = sourceSets["main"].runtimeClasspath
// }