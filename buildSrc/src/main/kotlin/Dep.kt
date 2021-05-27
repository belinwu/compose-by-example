import org.gradle.api.JavaVersion

@Suppress("MemberVisibilityCanBePrivate")
object Dep {
    // Common
    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"

    // Android
    const val androidGradleVersion = "7.0.0-beta02"
    const val compileSdk = 30
    const val targetSdk = 30
    const val minSdk = 21
    const val buildToolsVersion = "30.0.2"

    const val activityVersion = "1.3.0-alpha08"
    const val adsIdentifierVersion = "1.0.0-alpha04"
    const val appCompatVersion = "1.4.0-alpha01"
    const val appSearchVersion = "1.0.0-alpha01"
    const val cameraVersion = "1.0.0"
    const val cameraViewVersion = "1.0.0-alpha23"
    const val composeCompilerVersion = "1.4.32"
    const val composeVersion = "1.0.0-beta07"
    const val coreVersion = "1.6.0-beta01"
    const val dataBindingVersion = "7.0.0-alpha11"
    const val dataStoreVersion = "1.0.0-beta01"
    const val emoji2Version = "1.0.0-alpha01"
    const val emojiVersion = "1.2.0-alpha01"
    const val fragmentVersion = "1.4.0-alpha01"
    const val hiltVersion = "1.0.0"
    const val leanbackVersion = "1.1.0-alpha05"
    const val lifecycleVersion = "2.4.0-alpha01"
    const val listenableFutureVersion = "1.0.0-beta01"
    const val media2Version = "1.1.0-rc01"
    const val navigationVersion = "2.4.0-alpha01"
    const val pagingVersion = "3.0.0"
    const val roomVersion = "2.3.0-rc01"
    const val securityCryptoVersion = "1.1.0-alpha03"
    const val sqliteVersion = "2.1.0"
    const val testVersion = "1.3.0"
    const val windowVersion = "1.0.0-alpha06"
    const val workVersion = "2.7.0-alpha02"

    const val kotlinVersion = "1.4.32"
    const val coroutinesVersion = "1.5.0"
    const val serializationVersion = "1.2.1"
    const val coilVersion = "1.1.1"

    // Android Jetpack
    const val activity = "androidx.activity:activity:$activityVersion"
    const val activityCompose = "androidx.activity:activity-compose:$activityVersion"
    const val activityKtx = "androidx.activity:activity-ktx:$activityVersion"
    const val adsIdentifier = "androidx.ads:ads-identifier:$adsIdentifierVersion"
    const val adsIdentifierProvider = "androidx.ads:ads-identifier-provider:1.0.0-alpha02"
    const val annotation = "androidx.annotation:annotation:1.3.0-alpha01"
    const val annotationExperimental = "androidx.annotation:annotation-experimental:1.1.0"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    const val appCompatResources = "androidx.appcompat:appcompat-resources:$appCompatVersion"
    const val appSearch = "androidx.appsearch:appsearch:$appSearchVersion"
    const val appSearchLocalStorage = "androidx.appsearch:appsearch-local-storage:$appSearchVersion"
    const val autoFill = "androidx.autofill:autofill:1.1.0-alpha02"
    const val benchmark = "androidx.benchmark:benchmark-common:1.1.0-alpha02"
    const val biometric = "androidx.biometric:biometric:1.1.0-beta01"
    const val browser = "androidx.browser:browser:1.3.0-beta01"
    const val cameraCamera2 = "androidx.camera:camera-camera2:$cameraVersion"
    const val cameraCore = "androidx.camera:camera-core:$cameraVersion"
    const val cameraExtensions = "androidx.camera:camera-extensions:$cameraViewVersion"
    const val cameraLifecycle = "androidx.camera:camera-lifecycle:$cameraVersion"
    const val cameraView = "androidx.camera:camera-view:$cameraViewVersion"
    const val car = "androidx.car:car:1.0.0-alpha7"
    const val cardView = "androidx.cardview:cardview:1.0.0"
    const val collection = "androidx.collection:collection-ktx:1.2.0-alpha01"
    const val composeAnimation = "androidx.compose.animation:animation:$composeVersion"
    const val composeCompiler = "androidx.compose.compiler:compiler:$composeVersion"
    const val composeFoundation = "androidx.compose.foundation:foundation:$composeVersion"
    const val composeFoundationLayout = "androidx.compose.foundation:foundation-layout:$composeVersion"
    const val composeGeometry = "androidx.compose.ui:ui-geometry:$composeVersion"
    const val composeGraphics = "androidx.compose.ui:ui-graphics:$composeVersion"
    const val composeLiveData = "androidx.compose.runtime:runtime-livedata:$composeVersion"
    const val composeMaterial = "androidx.compose.material:material:$composeVersion"
    const val composeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:$composeVersion"
    const val composeMaterialRipple = "androidx.compose.material:material-ripple:$composeVersion"
    const val composeTest = "androidx.compose.ui:ui-test:$composeVersion"
    const val composeTestJunit = "androidx.compose.ui:ui-test-junit4:$composeVersion"
    const val composeText = "androidx.compose.ui:ui-text:$composeVersion"
    const val composeTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
    const val composeToolingData = "androidx.compose.ui:ui-tooling-data:$composeVersion"
    const val composeUi = "androidx.compose.ui:ui:$composeVersion"
    const val composeUnit = "androidx.compose.ui:ui-unit:$composeVersion"
    const val composeUtil = "androidx.compose.ui:ui-util:$composeVersion"
    const val composeViewBinding = "androidx.compose.ui:ui-viewbinding:$composeVersion"
    const val concurrentFutures = "androidx.concurrent:concurrent-futures-ktx:1.1.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.0-beta01"
    const val constraintLayoutCompose = "androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha07"
    const val contentPager = "androidx.contentpager:contentpager:1.0.0"
    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"
    const val core = "androidx.core:core-ktx:$coreVersion"
    const val coreAnimation = "androidx.core:core-animation:1.0.0-alpha02"
    const val coreRole = "androidx.core:core-role:1.1.0-alpha01"
    const val customView = "androidx.customview:customview:1.1.0"
    const val dataBinding = "androidx.databinding:databinding-runtime:$dataBindingVersion"
    const val dataBindingAdapters = "androidx.databinding:databinding-adapters:$dataBindingVersion"
    const val dataStore = "androidx.datastore:datastore:$dataStoreVersion"
    const val dataStorePreferences = "androidx.datastore:datastore-preferences:$dataStoreVersion"
    const val drawerLayout = "androidx.drawerlayout:drawerlayout:1.1.1"
    const val dynamicAnimation = "androidx.dynamicanimation:dynamicanimation-ktx:1.1.0-alpha03"
    const val emoji = "androidx.emoji:emoji:$emojiVersion"
    const val emoji2 = "androidx.emoji2:emoji2:$emoji2Version"
    const val emoji2Views = "androidx.emoji2:emoji2-views:$emoji2Version"
    const val emoji2ViewsHelper = "androidx.emoji2:emoji2-views-helper:$emoji2Version"
    const val emojiAppCompat = "androidx.emoji:emoji-appcompat:$emojiVersion"
    const val emojiBundled = "androidx.emoji:emoji-bundled:$emojiVersion"
    const val enterpriseFeedback = "androidx.enterprise:enterprise-feedback:1.0.0-alpha02"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
    const val exifInterface = "androidx.exifinterface:exifinterface:1.3.0"
    const val fragment = "androidx.fragment:fragment-ktx:$fragmentVersion"
    const val fragmentTesting = "androidx.fragment:fragment-testing:$fragmentVersion"
    const val gamesFramePacing = "androidx.games:games-frame-pacing:1.7.0-alpha01"
    const val gamesPerformanceTuner = "androidx.games:games-performance-tuner:1.1.0-alpha01"
    const val gridLayout = "androidx.gridlayout:gridlayout:1.0.0"
    const val healthServicesClient = "androidx.health:health-services-client:1.0.0-alpha01"
    const val heifWriter = "androidx.heifwriter:heifwriter:1.0.0"
    const val hilt = "androidx.hilt:hilt-common:$hiltVersion"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha02"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$hiltVersion"
    const val hiltWork = "androidx.hilt:hilt-work:$hiltVersion"
    const val interpolator = "androidx.interpolator:interpolator:1.0.0"
    const val leanback = "androidx.leanback:leanback:$leanbackVersion"
    const val leanbackPaging = "androidx.leanback:leanback-paging:$leanbackVersion"
    const val leanbackPreference = "androidx.leanback:leanback-preference:$leanbackVersion"
    const val leanbackTab = "androidx.leanback:leanback-tab:$leanbackVersion"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common:$lifecycleVersion"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"
    const val lifecycleJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:$lifecycleVersion"
    const val lifecycleService = "androidx.lifecycle:lifecycle-service:$lifecycleVersion"
    const val listenableFuture = "androidx.concurrent:concurrent-listenablefuture:$listenableFutureVersion"
    const val listenableFutureCallback = "androidx.concurrent:concurrent-listenablefuture-callback:$listenableFutureVersion"
    const val liveData = "androidx.lifecycle:lifecycle-livedata:$lifecycleVersion"
    const val liveDataCore = "androidx.lifecycle:lifecycle-livedata-core:$lifecycleVersion"
    const val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:$lifecycleVersion"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val loader = "androidx.loader:loader:1.1.0"
    const val localBroadcastManager = "androidx.localbroadcastmanager:localbroadcastmanager:1.0.0"
    const val media = "androidx.media:media:1.3.0-rc02"
    const val media2Common = "androidx.media2:media2-common:$media2Version"
    const val media2ExoPlayer = "androidx.media2:media2-exoplayer:$media2Version"
    const val media2Player = "androidx.media2:media2-player:$media2Version"
    const val media2Session = "androidx.media2:media2-session:$media2Version"
    const val media2Widget = "androidx.media2:media2-widget:$media2Version"
    const val mediaRouter = "androidx.mediarouter:mediarouter:1.2.2"
    const val multiDex = "androidx.multidex:multidex:2.0.1"
    const val navigation = "androidx.navigation:navigation-runtime-ktx:$navigationVersion"
    const val navigationCompose = "android.navigation:navigation-compose:1.0.0-alpha10"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
    const val paging = "androidx.paging:paging-runtime-ktx:$pagingVersion"
    const val pagingCompose = "androidx.paging:paging-compose:1.0.0-alpha09"
    const val palette = "androidx.palette:palette-ktx:1.0.0"
    const val preference = "androidx.preference:preference-ktx:1.1.1"
    const val recommendation = "androidx.recommendation:recommendation:1.0.0"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0"
    const val recyclerViewSelection = "androidx.recyclerview:recyclerview-selection:1.1.0-rc03"
    const val remoteCallback = "androidx.remotecallback:remotecallback:1.0.0-alpha02"
    const val remoteCallbackProcessor = "androidx.remotecallback:remotecallback-processor:1.0.0-alpha02"
    const val resourceInspection = "androidx.resourceinspection:resourceinspection-annotation:1.0.0-alpha01"
    const val room = "androidx.room:room-ktx:$roomVersion"
    const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    const val roomMigration = "androidx.room:room-migration:$roomVersion"
    const val savedState = "androidx.savedstate:savedstate-ktx:1.1.0"
    const val securityCrypto = "androidx.security:security-crypto:$securityCryptoVersion"
    const val securityCryptoKtx = "androidx.security:security-crypto-ktx:$securityCryptoVersion"
    const val securityIdentity = "androidx.security:security-identity-credential:1.0.0-alpha01"
    const val shareTarget = "androidx.sharetarget:sharetarget:1.1.0-beta01"
    const val slice = "androidx.slice:slice-core:1.0.0"
    const val sliceBuilders = "androidx.slice:slice-builders:1.0.0"
    const val sliceView = "androidx.slice:slice-view:1.0.0"
    const val slidingPaneLayout = "androidx.slidingpanelayout:slidingpanelayout:1.2.0-alpha01"
    const val sqlite = "androidx.sqlite:sqlite-ktx:$sqliteVersion"
    const val startup = "androidx.startup:startup-runtime:1.1.0-beta01"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01"
    const val testCore = "androidx.test:core:$testVersion"
    const val testCoreKtx = "androidx.test:core-ktx:$testVersion"
    const val testJunit = "androidx.test.ext:junit:1.1.1"
    const val testMonitor = "androidx.test:monitor:$testVersion"
    const val testOrchestrator = "androidx.test:orchestrator:$testVersion"
    const val testRules = "androidx.test:rules:$testVersion"
    const val testRunner = "androidx.test:runner:$testVersion"
    const val testUiAutomator = "androidx.test.uiautomator:uiautomator:2.2.0"
    const val textClassifier = "androidx.textclassifier:textclassifier:1.0.0-alpha02"
    const val tracing = "androidx.tracing:tracing-ktx:1.0.0"
    const val transition = "androidx.transition:transition:1.4.0-beta01"
    const val tvProvider = "androidx.tvprovider:tvprovider:1.1.0-alpha01"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:1.2.0-alpha02"
    const val vectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:1.1.0"
    const val vectorDrawableSeekable = "androidx.vectordrawable:vectordrawable-seekable:1.0.0-alpha02"
    const val versionedParcelable = "androidx.versionedparcelable:versionedparcelable:1.1.0"
    const val viewBinding = "androidx.databinding:viewbinding:$dataBindingVersion"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha05"
    const val viewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion"
    const val viewPager = "androidx.viewpager:viewpager:1.0.0"
    const val viewPager2 = "androidx.viewpager2:viewpager2:1.1.0-alpha01"
    const val wear = "androidx.wear:wear:1.0.0"
    const val webkit = "androidx.webkit:webkit:1.4.0-alpha01"
    const val window = "androidx.window:window:$windowVersion"
    const val windowExtensions = "androidx.window:window-extensions:$windowVersion"
    const val work = "androidx.work:work-runtime-ktx:$workVersion"
    const val workMultiProcess = "androidx.work:work-multiprocess:$workVersion"
    const val workTesting = "androidx.work:work-testing:$workVersion"

    const val material = "com.google.android.material:material:1.4.0-beta01"
    const val composeThemeAdapter = "com.google.android.material:compose-theme-adapter:1.0.0-beta01"
    const val ksp = "com.google.devtools.ksp:symbol-processing-api:1.4.30-1.0.0-alpha05"
    const val flexbox = "com.google.android:flexbox:2.0.1"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val kotlinStdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$kotlinVersion"
    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
    const val kotlinScripting = "org.jetbrains.kotlin:kotlin-scripting-jvm:$kotlinVersion"
    const val kotlinCompiler = "org.jetbrains.kotlin:kotlin-compiler:$kotlinVersion"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$coroutinesVersion"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"
    const val coroutinesDebug = "org.jetbrains.kotlinx:kotlinx-coroutines-debug:$coroutinesVersion"
    const val kotlinAtomicFu = "org.jetbrains.kotlinx:atomicfu:0.16.1"
    const val kotlinMetadataJvm = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.0.4"
    const val kotlinImmutableCollections = "org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.3"
    const val kotlinIo = "org.jetbrains.kotlinx:kotlinx-io-jvm:0.1.16"
    const val kotlinDateTime = "org.jetbrains.kotlinx:kotlinx-datetime:0.2.0"
    const val kotlinSerializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationVersion"
    const val kotlinSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
    const val kotlinSerializationProtoBuf = "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$serializationVersion"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.5"
    const val okhttp = "com.squareup.okhttp3:okhttp:4.9.0"
    const val okio = "com.squareup.okio:okio:2.9.0"
    const val gson = "com.google.code.gson:gson:2.8.6"
    const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val glide = "com.github.bumptech.glide:glide:4.12.0"
    const val glideCompiler = "com.github.bumptech.glide:compiler:4.11.0"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
    const val junit = "junit:junit:4.13"
    const val lottie = "com.airbnb.android:lottie:3.4.2"
    const val coil = "io.coil-kt:coil:$coilVersion"
    const val coilGif = "io.coil-kt:coil-gif:$coilVersion"
    const val coilSvg = "io.coil-kt:coil-svg:$coilVersion"
    const val coilVideo = "io.coil-kt:coil-video:$coilVersion"
    const val accompanistCoil = "com.google.accompanist:accompanist-coil:0.10.0"
    const val accompanistGlide = "com.google.accompanist:accompanist-glide:0.10.0"
}