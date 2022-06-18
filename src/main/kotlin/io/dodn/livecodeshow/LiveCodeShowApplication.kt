package io.dodn.livecodeshow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiveCodeShowApplication

fun main(args: Array<String>) {
    runApplication<LiveCodeShowApplication>(*args)
}
