package com.open3r.openwiki.domain.wiki.controller

import com.open3r.openwiki.domain.wiki.dto.request.WikiCreateRequest
import com.open3r.openwiki.domain.wiki.service.WikiService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/wikis")
class WikiController(
    private val wikiService: WikiService
) {
    @GetMapping
    fun getWikis() = wikiService.getWikis()

    @GetMapping("/{wikiId}")
    fun getWiki(@PathVariable wikiId: Long) = wikiService.getWiki(wikiId)

    @PostMapping
    fun createWiki(@RequestBody request: WikiCreateRequest) = wikiService.createWiki(request)

    @DeleteMapping("/{wikiId}")
    fun deleteWiki(@PathVariable wikiId: Long) = wikiService.deleteWiki(wikiId)
}