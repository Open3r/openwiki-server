package com.open3r.openwiki.domain.wiki.dto.request

data class WikiCreateRequest(
    val title: String,
    val content: String
)