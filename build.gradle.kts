// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-dev") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
        maven { url = uri("https://jitpack.io") }
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${Dep.androidGradleVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Dep.kotlinVersion}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-dev") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
        maven { url = uri("https://jitpack.io") }
    }

    configurations.all {
        resolutionStrategy {
            force(Dep.activity)
            force(Dep.activityKtx)
            force(Dep.annotation)
            force(Dep.annotationExperimental)
            force(Dep.appCompat)
            force(Dep.appCompatResources)
            force(Dep.core)
            force(Dep.coroutinesAndroid)
            force(Dep.coroutinesCore)
            force(Dep.coroutinesCore)
            force(Dep.coroutinesDebug)
            force(Dep.coroutinesTest)
            force(Dep.customView)
            force(Dep.drawerLayout)
            force(Dep.exifInterface)
            force(Dep.junit)
            force(Dep.kotlinReflect)
            force(Dep.kotlinStdlib)
            force(Dep.kotlinStdlibCommon)
            force(Dep.kotlinStdlibJdk8)
            force(Dep.lifecycle)
            force(Dep.lifecycleCommon)
            force(Dep.liveData)
            force(Dep.liveDataCore)
            force(Dep.liveDataCoreKtx)
            force(Dep.loader)
            force(Dep.startup)
            force(Dep.tracing)
            force(Dep.transition)
            force(Dep.vectorDrawable)
            force(Dep.viewBinding)
            force(Dep.viewModel)
            force(Dep.viewPager2)
        }
    }
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}