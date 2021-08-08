plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
}

android {
    compileSdk = Dep.compileSdk
    buildToolsVersion = Dep.buildToolsVersion

    defaultConfig {
        applicationId = "com.samelody.samples.compose"
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
        viewBinding = true
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
    implementation(Dep.composeLiveData)
    implementation(Dep.composeMaterial)
    implementation(Dep.composeTooling)
    implementation(Dep.composeViewBinding)
    implementation(Dep.lifecycle)
    implementation(Dep.viewModelCompose)
    implementation(Dep.activityCompose)
    implementation(Dep.constraintLayoutCompose)
    implementation(Dep.coil)
    implementation(Dep.coilGif)
    implementation(Dep.coilVideo)
    implementation(Dep.coilSvg)
    implementation(Dep.coilCompose)
    implementation(Dep.accompanistFlowLayout)
    implementation(Dep.accompanistInsets)
    implementation(Dep.accompanistPager)
    implementation(Dep.accompanistPagerIndicators)
    implementation(Dep.accompanistSwipeRefresh)
    implementation(Dep.accompanistSystemUiController)

    testImplementation(Dep.junit)

    androidTestImplementation(Dep.testJunit)
    androidTestImplementation(Dep.espressoCore)
    androidTestImplementation(Dep.composeTestJunit)
}