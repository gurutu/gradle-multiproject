plugins {
    `java-library`
}
//val libs = project.ext["libs"] as Map<*, *>
//val libsTest = project.ext["libsTest"] as Map<*, *>

dependencies {
    // https://mvnrepository.com/artifact/com.google.guava/guava
//    api(libs["guava"] as String)
    api("com.google.guava:guava:33.4.8-jre")
}

subprojects {
    tasks.withType<Jar> {
        enabled = true
    }

}