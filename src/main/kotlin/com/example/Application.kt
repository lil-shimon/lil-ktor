package com.example

import io.ktor.server.application.*
import com.example.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    // first line should be koin ( due to avoiding compile error )
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeader()
}
