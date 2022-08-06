package com.slin.deps

import org.gradle.api.JavaVersion
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

object Versions {

//    lateinit var properties: Map<String, *>
//
//    fun initDeps(project: Project) {
//        properties = project.properties
//        println("initDeps: $project $properties")
//    }

    const val androidSdk = 31
    const val androidBuildTools = "30.0.3"
    const val androidMinSdk = 24

    val javaVersion = JavaVersion.VERSION_11
    val kotlinVersion: String = "1.6.21"

    //        get() = properties["kotlin.version"] as String
    const val kotlinJvmTarget = "1.8"
    val agpVersion: String = "7.2.1"

    //        get() = properties["agp.version"] as String
    val composeVersion: String = "1.1.0"
//        get() = properties["compose.version"] as String

    const val ktlint = "0.46.0"
}

object Libs {
    private val agpVersion = Versions.agpVersion
    val androidGradlePlugin = "com.android.tools.build:gradle:$agpVersion"

    object Slin {
        private const val snapshot = "score_snapshot"
        private const val version = "1.1.3"
        const val score = "io.github.dxslin:Score:$version"
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:1.3.0"
    }

    /**
     * Google Compose 扩展库
     * doc: https://google.github.io/accompanist/
     */
    object Accompanist {
        private const val version = "0.23.1"
        const val insets = "com.google.accompanist:accompanist-insets:$version"
        const val theme = "com.google.accompanist:accompanist-appcompat-theme:$version"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:$version"
        const val flowlayout = "com.google.accompanist:accompanist-flowlayout:$version"
        const val pager = "com.google.accompanist:accompanist-pager:$version"
        const val pagerIndicators = "com.google.accompanist:accompanist-pager-indicators:$version"
        const val swipeRefresh = "com.google.accompanist:accompanist-swiperefresh:$version"
        const val placeholder = "com.google.accompanist:accompanist-placeholder-material:$version"
        const val drawablePainter = "com.google.accompanist:accompanist-drawablepainter:$version"
        const val permissions = "com.google.accompanist:accompanist-permissions:$version"
        const val navMaterial = "com.google.accompanist:accompanist-navigation-material:$version"
        const val navAnimation = "com.google.accompanist:accompanist-navigation-animation:$version"
    }

    object Kotlin {
        private val version = Versions.kotlinVersion
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
        val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"

        /**
         * https://github.com/Kotlin/kotlinx-datetime
         */
        val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:0.3.3"

        object Coroutines {
            private const val version = "1.6.1"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
            const val swing = "org.jetbrains.kotlinx:kotlinx-coroutines-swing:$version"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
        }

        object Serialization {
            private const val version = "1.2.2"

            /**
             * plugins { kotlin("plugin.serialization") }
             */
            val plugin = "org.jetbrains.kotlin:kotlin-serialization:${Kotlin.version}"
            const val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:$version"
        }

        /**
         * https://github.com/Kotlin/kotlinx.atomicfu
         */
        object Atomicfu {
            val version = "0.17.2"
            val gradlePlugin = "org.jetbrains.kotlinx:atomicfu-gradle-plugin:$version"
            val gradlePluginName = "kotlinx-atomicfu"
            val automicfu = "org.jetbrains.kotlinx:atomicfu:$version"
        }
    }

    object AndroidX {
        /**
         * https://developer.android.google.cn/jetpack/androidx/releases/core
         */
        const val coreKtx = "androidx.core:core-ktx:1.8.0"

        /**
         * https://github.com/material-components/material-components-android/releases
         */
        const val material = "com.google.android.material:material:1.6.1"

        /**
         * https://developer.android.google.cn/jetpack/androidx/releases/appcompat
         */
        const val appcompat = "androidx.appcompat:appcompat:1.4.2"

        const val annotation = "androidx.annotation:annotation:1.2.0"

        /**
         * https://developer.android.google.cn/jetpack/androidx/releases/compose
         */
        object Compose {
            const val snapshot = ""
            private val version = Versions.composeVersion

            val animation = "androidx.compose.animation:animation:$version"
            val foundation = "androidx.compose.foundation:foundation:$version"
            val layout = "androidx.compose.foundation:foundation-layout:$version"
            val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
            val material = "androidx.compose.material:material:$version"
            val runtime = "androidx.compose.runtime:runtime:$version"
            val tooling = "androidx.compose.ui:ui-tooling:$version" // preview
            val ui = "androidx.compose.ui:ui:$version"
            val uiGraphics = "androidx.compose.ui:ui-graphics:$version"
            val uiUtil = "androidx.compose.ui:ui-util:$version"
            val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"

            val livedata = "androidx.compose.runtime:runtime-livedata:$version"
        }

        /**
         * https://developer.android.google.cn/jetpack/androidx/releases/activity
         */
        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        /**
         * https://developer.android.google.cn/jetpack/androidx/explorer
         */
        object Jetpack {
            /**
             * https://developer.android.google.cn/jetpack/androidx/releases/lifecycle
             */
            private const val lifecycleVersion = "2.4.1"

            /**
             * https://dagger.dev/hilt/gradle-setup
             * https://developer.android.google.cn/jetpack/androidx/releases/hilt
             */
            private const val hiltVersion = "2.41"
            private const val hiltViewModelVersion = "1.0.0"

            /**
             * https://developer.android.google.cn/jetpack/androidx/releases/room
             */
            private const val roomVersion = "2.4.2"

            /**
             * https://developer.android.google.cn/jetpack/androidx/releases/paging
             */
            private const val pagingComposeVersion = "1.0.0-alpha14"
            private const val pagingVersion = "3.1.1"

            /**
             * https://developer.android.google.cn/jetpack/androidx/releases/datastore
             */
            private const val dataStoreVersion = "1.0.0"

            /**
             * https://github.com/google/protobuf-gradle-plugin/
             */
            private const val protobufPluginVersion = "0.8.18"
            private const val protobufVersion = "3.10.0"

            const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
            const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
            const val lifecycleViewModel =
                "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"

            const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
            const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
            const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
            const val hiltViewModel =
                "androidx.hilt:hilt-lifecycle-viewmodel:$hiltViewModelVersion"
            const val hiltViewModelCompiler = "androidx.hilt:hilt-compiler:$hiltViewModelVersion"
            const val hiltNavigationCompose =
                "androidx.hilt:hilt-navigation-compose:$hiltViewModelVersion"

            const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
            const val roomKtx = "androidx.room:room-ktx:$roomVersion"
            const val roomCompiler = "androidx.room:room-compiler:$roomVersion"

            const val paging = "androidx.paging:paging-common:$pagingVersion"
            const val pagingCompose = "androidx.paging:paging-compose:$pagingComposeVersion"

            const val dataStoreCore = "androidx.datastore:datastore-core:$dataStoreVersion"
            const val dataStorePreferences =
                "androidx.datastore:datastore-preferences:$dataStoreVersion"
            const val protobufPlugin =
                "com.google.protobuf:protobuf-gradle-plugin:$protobufPluginVersion"
            const val protobufLite = "com.google.protobuf:protobuf-javalite:$protobufVersion"
        }

        object Weights {
            /**
             * https://developer.android.google.cn/jetpack/androidx/releases/navigation
             */
            object Navigation {
                private const val version = "2.4.2"
                const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
                const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"

                const val navigation = "androidx.navigation:navigation-compose:2.4.0-alpha06"
            }

            /**
             * https://developer.android.google.cn/jetpack/androidx/releases/constraintlayout
             */
            object ConstraintLayout {
                const val constraintLayout =
                    "androidx.constraintlayout:constraintlayout:2.1.4"
                const val constraintLayoutCompose =
                    "androidx.constraintlayout:constraintlayout-compose:1.0.0-beta02"
            }
        }
    }

    object Logger {
        /**
         * https://github.com/JakeWharton/timber
         */
        const val timber = "com.jakewharton.timber:timber:5.0.1"
    }

    /**
     * 跨平台可以使用的库
     * https://github.com/arkivanov/Kotlin-Multiplatform-Libraries
     */
    object MultiPlatform {

        /**
         * 依赖注入
         * https://github.com/Kodein-Framework/Kodein-DI
         * https://docs.kodein.org/kodein-di/7.11/core/install.html#kotlin-js
         */
        object Kodein {
            private const val kodeinVersion = "7.11.0"
            const val kodein = "org.kodein.di:kodein-di:$kodeinVersion"
            const val kodeinAndroidCore =
                "org.kodein.di:kodein-di-framework-android-core:$kodeinVersion"
            const val kodeinAndroidViewModel =
                "org.kodein.di:kodein-di-framework-android-x-viewmodel:$kodeinVersion"
            const val kodeinAndroidViewModelSavedState =
                "org.kodein.di:kodein-di-framework-android-x-viewmodel-savedstate:$kodeinVersion"
            const val kodeinCompose = "org.kodein.di:kodein-di-framework-compose:$kodeinVersion"
        }

        /**
         * 跨平台网络请求
         * https://github.com/ktorio/ktor
         * https://ktor.io/docs/getting-started-ktor-client.html#create-client
         */
        object Ktor {
            private const val ktorVersion = "2.0.1"
            const val ktorClientCore = "io.ktor:ktor-client-core:$ktorVersion"
            const val ktorClientWebsockets = "io.ktor:ktor-client-websockets:$ktorVersion"

            const val ktorClientCio =
                "io.ktor:ktor-client-cio:$ktorVersion" // android cio 仅支持http 1.x
            const val ktorClientOkhttp =
                "io.ktor:ktor-client-okhttp:$ktorVersion" // android okhttp
            const val ktorClientAndroid = "io.ktor:ktor-client-android:$ktorVersion" // android

            const val ktorClientApache = "io.ktor:ktor-client-apache:$ktorVersion" // java apache引擎
            const val ktorClientJava = "io.ktor:ktor-client-java:$ktorVersion" // java java引擎
            const val ktorClientJetty = "io.ktor:ktor-client-jetty:$ktorVersion" // java jetty引擎

            const val ktorClientJs = "io.ktor:ktor-client-js:$ktorVersion" // java js

            const val ktorClientDarwin = "io.ktor:ktor-client-darwin:$ktorVersion" // native ios
            const val ktorClientCurl =
                "io.ktor:ktor-client-curl:$ktorVersion" // native ios linuxX64, macosX64, macosArm64, mingwX64

            const val ktorClientLogging = "io.ktor:ktor-client-logging:$ktorVersion" // 日志
            const val ktorClientAuth = "io.ktor:ktor-client-auth:$ktorVersion" // 身份认证

            const val ktorClientNegotiation =
                "io.ktor:ktor-client-content-negotiation:$ktorVersion" // 序列化
            const val ktorClientJson =
                "io.ktor:ktor-serialization-kotlinx-json:$ktorVersion" // 序列化 json
            const val ktorClientXml =
                "io.ktor:ktor-serialization-kotlinx-xml:$ktorVersion" // 序列化 xml
            const val ktorClientCbor =
                "io.ktor:ktor-serialization-kotlinx-cbor:$ktorVersion" // 序列化 cbor
            const val testClientMock = "io.ktor:ktor-client-mock:$ktorVersion" // 序列化 cbor
        }

        /**
         * 跨平台设置项
         * https://github.com/russhwolf/multiplatform-settings
         */
        object Setting {
            private const val version = "0.8"
            const val multiSetting = "com.russhwolf:multiplatform-settings:$version"
            const val multiSettingNoArgs = "com.russhwolf:multiplatform-settings-no-arg:$version"
            const val multiSettingSerialization =
                "com.russhwolf:multiplatform-settings-serialization:$version"
            const val multiSettingCoroutines =
                "com.russhwolf:multiplatform-settings-coroutines:$version"
            const val multiSettingDataStore =
                "com.russhwolf:multiplatform-settings-datastore:$version"
        }

        /**
         * https://docs.korge.org/
         */
        object Korlibs {

            private const val version = "2.7.0"

            // 日期时间，应该可以使用kotlin-datatime，不需要使用这个
            val klock by multiKorLibs()
            // 如果需要单独导入其他平台的依赖，在名字后面追加平台即可
//            val klockJvm  by multiKorLibs()
//            val klockAndroid  by multiKorLibs()
//            val klockJs  by multiKorLibs()

            // IO
            val korio by multiKorLibs()

            // 数学库 Math
            val korma by multiKorLibs()

            // 图片库
            val korim by multiKorLibs()

            // 数据结构
            val kds by multiKorLibs()

            // 数据快速填充/复制
            val kmem by multiKorLibs()

            // 日志
            val klogger by multiKorLibs()

            // 音频播放和声音文件解码
            val korau by multiKorLibs()

            // 大数字处理
            val kbignum by multiKorLibs()

            // 加密
            val krypto by multiKorLibs()

            // 依赖注入
            val korinject by multiKorLibs()

            private fun multiKorLibs(): ReadOnlyProperty<Korlibs, String> {
                return ReadOnlyProperty { _, property ->
                    val (name, platform) = obtainNamedPlatform(property)
                    // com.soywiz.korlibs.klock:klock-jvm:version
                    return@ReadOnlyProperty buildString {
                        append("com.soywiz.korlibs.")
                        append(name)
                        append(":")
                        append(name)
                        if (platform.isNotBlank()) {
                            append("-$platform")
                        }
                        append(":$version")
                    }
                }
            }

            private fun obtainNamedPlatform(property: KProperty<*>): NamedPlatform {
                val name = property.name
                return when {
                    name.endsWith("Jvm") -> NamedPlatform(name.removeSuffix("Jvm"), "jvm")
                    name.endsWith("Android") -> NamedPlatform(name.removeSuffix("Android"), "jvm")
                    name.endsWith("Js") -> NamedPlatform(name.removeSuffix("Js"), "jvm")
                    else -> NamedPlatform(name, "")
                }
            }

            private data class NamedPlatform(val name: String, val platform: String)
        }

        /**
         * 数据库
         * https://cashapp.github.io/sqldelight/multiplatform_sqlite/
         */
        object SqlDelight {
            private const val version = "1.5.3"

            const val name = "com.squareup.sqldelight"
            const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:$version"
            const val androidDriver = "com.squareup.sqldelight:android-driver:$version"
            const val nativeDriver =
                "com.squareup.sqldelight:native-driver:$version" // native、ios、windows
            const val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:$version"
        }

        /**
         * MVI
         */
        object Arkivanov {

            /**
             * https://github.com/arkivanov/Decompose
             */
            object Decompose {
                private const val VERSION = "0.6.0"
                const val decompose = "com.arkivanov.decompose:decompose:$VERSION"
                const val extensionsCompose =
                    "com.arkivanov.decompose:extensions-compose-jetbrains:$VERSION"
            }

            /**
             * https://github.com/arkivanov/MVIKotlin/releases
             */
            object MVIKotlin {
                private const val VERSION = "3.0.0-beta02"
                const val rx = "com.arkivanov.mvikotlin:rx:$VERSION"
                const val mvikotlin = "com.arkivanov.mvikotlin:mvikotlin:$VERSION"
                const val mvikotlinMain = "com.arkivanov.mvikotlin:mvikotlin-main:$VERSION"
                const val mvikotlinLogging = "com.arkivanov.mvikotlin:mvikotlin-logging:$VERSION"
                const val mvikotlinTimeTravel =
                    "com.arkivanov.mvikotlin:mvikotlin-timetravel:$VERSION"
                const val mvikotlinExtensionsReaktive =
                    "com.arkivanov.mvikotlin:mvikotlin-extensions-reaktive:$VERSION"
                const val mvikotlinExtensionsCoroutines =
                    "com.arkivanov.mvikotlin:mvikotlin-extensions-coroutines:$VERSION"
            }

            object Essenty {
                private const val VERSION = "0.2.2"
                const val lifecycle = "com.arkivanov.essenty:lifecycle:$VERSION"
            }
        }

        /**
         * 图片加载库
         */
        object Image {

            /**
             * https://github.com/alialbaali/Kamel#multiplatform
             * 作者似乎没有更新了，导致与当前的ktor版本不兼容，因此将代码放到了`:kamel`模块中
             */
            const val kamel = "com.alialbaali.kamel:kamel-image:0.3.0"
        }

        /**
         * 分页库
         */
        object Paging {

            /**
             * https://github.com/kuuuurt/multiplatform-paging
             */
            const val paging = "io.github.kuuuurt:multiplatform-paging:0.4.7"
        }
    }

    object Test {
        private const val junit_version = "4.13.2"
        private const val version = "1.3.0"

        const val junit = "junit:junit:$junit_version"
        const val core = "androidx.test:core:$version"
        const val rules = "androidx.test:rules:$version"
        const val junitJupiter = "org.junit.jupiter:junit-jupiter:5.8.2"

        object Ext {
            private const val version = "1.1.3"
            const val junit = "androidx.test.ext:junit-ktx:$version"
        }

        const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
    }
}
