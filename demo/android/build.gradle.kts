plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":demo:common"))
    implementation("androidx.activity:activity-compose:1.7.2")
}

android {
    namespace = "com.wakaztahir.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.wakaztahir.android"
        minSdk = 21
        versionCode = 1
        versionName = "1.0.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
        }
    }
}