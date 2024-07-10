package com.open3r.openwiki.domain.wiki.service

import com.open3r.openwiki.domain.wiki.dto.request.WikiCreateRequest
import com.open3r.openwiki.domain.wiki.dto.response.WikiResponse

interface WikiService {
    fun getWikis(): List<WikiResponse>
    fun getWiki(wikiId: Long): WikiResponse
    fun createWiki(request: WikiCreateRequest)
    fun deleteWiki(wikiId: Long)
}