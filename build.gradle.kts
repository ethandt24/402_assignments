plugins {
    // usually empty here for multi-project, unless you want global plugins
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    // Shared config across all subprojects
    apply(plugin = "java")

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
