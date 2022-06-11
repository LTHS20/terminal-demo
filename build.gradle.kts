plugins {
    java
    kotlin("jvm") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    application
}

group = "ltd.lths.terminal.demo"
version = "1.0.0"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    kotlin("stable")

    implementation("commons-io:commons-io:2.11.0")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.apache.logging.log4j:log4j-api:2.17.2")
    implementation("org.apache.logging.log4j:log4j-core:2.17.2")
    implementation("org.apache.logging.log4j:log4j-slf4j18-impl:2.17.2")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("net.minecrell:terminalconsoleappender:1.3.0")
    implementation("org.jline:jline-terminal-jansi:3.21.0")
    implementation("net.sf.jopt-simple:jopt-simple:5.0.4")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.shadowJar {
    exclude("META-INF/org/apache/logging/log4j/core/config/plugins/Log4j2Plugins.dat")
    classifier = null
}

application {
    mainClass.set("${rootProject.group}.Main")
}
