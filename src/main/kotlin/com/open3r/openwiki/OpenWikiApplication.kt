package com.open3r.openwiki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class OpenWikiApplication

fun main(args: Array<String>) {
    runApplication<OpenWikiApplication>(*args)
}
