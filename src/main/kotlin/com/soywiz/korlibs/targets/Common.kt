package com.soywiz.korlibs.targets

import com.soywiz.korlibs.*
import org.gradle.api.*

fun Project.configureTargetCommon() {
    dependencies.apply {
        add("commonMainImplementation", "org.jetbrains.kotlin:kotlin-stdlib-common")
        add("commonTestImplementation", "org.jetbrains.kotlin:kotlin-test-annotations-common")
        add("commonTestImplementation", "org.jetbrains.kotlin:kotlin-test-common")
		gkotlin.apply {
			metadata {
				compilations.all {
					it.kotlinOptions {
						suppressWarnings = korlibs.supressWarnings
					}
				}
			}
		}
    }
}