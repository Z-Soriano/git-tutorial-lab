plugins {
    id("java")
}

group = "edu.sdsu.appdev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest {
        attributes(mapOf(
            "Main-Class" to "edu.sdsu.appdev.Main",
        ))
    }
}