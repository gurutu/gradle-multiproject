plugins {
    `java-library`
}
//val libs = project.ext["libs"] as Map<*, *>
//val libsTest = project.ext["libsTest"] as Map<*, *>

dependencies {
    // https://mvnrepository.com/artifact/com.google.guava/guava
//    api(libs["guava"] as String)
    api(libs.guava.lib)
}

subprojects {
    tasks.withType<Jar> {
        enabled = true
    }

}