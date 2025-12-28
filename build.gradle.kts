import org.gradle.kotlin.dsl.*

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
   // kotlin("jvm") version "2.2.21"
   // kotlin("plugin.spring") version "2.2.21"
    alias(libs.plugins.spring.boot)
//    id("org.springframework.boot") version "4.0.1"
    id("io.spring.dependency-management") version "1.1.7"
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }
    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(17)
        }
    }
    dependencies {
        // implementation(libs["spring-boot-starter"] as String)
        //  implementation(libs["kotlin-reflect"] as String)
        //  testImplementation(libsTest["spring-boot-starter-test"] as String)
        //  testImplementation(libsTest["kotlin-test-junit5"] as String)
        //  testImplementation(libsTest["junit-platform-launcher"] as String)
         implementation(rootProject.libs.spring.boot.starter)
        implementation(rootProject.libs.kotlin.reflect)
        testImplementation(rootProject.libs.spring.boot.starter.test)
        testImplementation(rootProject.libs.kotlin.test.junit5)
        testRuntimeOnly(rootProject.libs.junit.platform.launcher)
         //  implementation("org.springframework.boot:spring-boot-starter")
         // implementation("org.jetbrains.kotlin:kotlin-reflect")
         //  testImplementation("org.springframework.boot:spring-boot-starter-test")
         // testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
          // testRuntimeOnly("org.junit.platform:junit-platform-launcher")


    }

    kotlin {
        compilerOptions {
            freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
        }
    }

}
allprojects {
    tasks.register("hello") {
        doLast {
            println("Hello world! ${project.name}")
        }
    }
    //apply(from ="${rootProject.projectDir}/dependencies.gradle")
//    java {
//        toolchain {
//            languageVersion = JavaLanguageVersion.of(17)
//        }
//    }

    repositories {
        mavenCentral()
    }
//    val libs = project.ext["libs"] as Map<*, *>
//    val libsTest = project.ext["libsTest"] as Map<*, *>
//    val libs = extensions.getByName("libs")
//println(libs)
    //dependencies {
//        implementation(libs["spring-boot-starter"] as String)
//        implementation(libs["kotlin-reflect"] as String)
//        testImplementation(libsTest["spring-boot-starter-test"] as String)
//        testImplementation(libsTest["kotlin-test-junit5"] as String)
//        testImplementation(libsTest["junit-platform-launcher"] as String)
     //   implementation("org.springframework.boot:spring-boot-starter")
      //  implementation("org.jetbrains.kotlin:kotlin-reflect")
     //   testImplementation("org.springframework.boot:spring-boot-starter-test")
      //  testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
     //   testRuntimeOnly("org.junit.platform:junit-platform-launcher")
   // }



    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
