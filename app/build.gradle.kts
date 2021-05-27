plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = Dep.compileSdk
    buildToolsVersion = Dep.buildToolsVersion

    defaultConfig {
        applicationId = "com.samelody.samples.composedemo"
        minSdk = Dep.minSdk
        targetSdk = Dep.targetSdk
        versionCode = 1
        versionName = "0.1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Dep.javaVersion
        targetCompatibility = Dep.javaVersion
    }
    kotlinOptions {
        jvmTarget = Dep.jvmTarget
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dep.composeVersion
        kotlinCompilerVersion = Dep.composeCompilerVersion
    }
}

dependencies {
    implementation(Dep.kotlinStdlib)
    implementation(Dep.core)
    implementation(Dep.appCompat)
    implementation(Dep.material)
    implementation(Dep.composeUi)
    implementation(Dep.composeMaterial)
    implementation(Dep.composeTooling)
    implementation(Dep.lifecycle)
    implementation(Dep.activityCompose)

    testImplementation(Dep.junit)

    androidTestImplementation(Dep.testJunit)
    androidTestImplementation(Dep.espressoCore)
    androidTestImplementation(Dep.composeTestJunit)
}