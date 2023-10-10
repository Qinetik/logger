plugins {
    kotlin("multiplatform")
    id("maven-publish")
    id("com.android.library")
}

group = "org.qinetik"
version = findProperty("version") as String

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {

            }
        }
        val androidInstrumentedTest by getting {
            dependencies {
                implementation("androidx.test:runner:1.5.2")
                implementation("androidx.test:core-ktx:1.5.0")
            }
        }
        val desktopMain by getting {
            dependencies {

            }
        }
        val desktopTest by getting
        val jsMain by getting
    }
}

android {
    namespace = "org.qinetik.logger"
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

publishing {
    repositories {
        maven("https://maven.pkg.github.com/Qinetik/logger") {
            name = "GithubPackages"
            credentials {
                username = (System.getenv("GPR_USER")).toString()
                password = (System.getenv("GPR_API_KEY")).toString()
            }
        }
    }
}