package com.open3r.openwiki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenwikiApplication

fun main(args: Array<String>) {
    runApplication<OpenwikiApplication>(*args)
}
