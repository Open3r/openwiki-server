package com.open3r.openwiki.domain.wiki.dto.response

import com.open3r.openwiki.domain.wiki.domain.Wiki

data class WikiResponse(
    val id: Long,
    val title: String,
    val content: String
) {
    companion object {
        fun of(wiki: Wiki) = WikiResponse(
            id = wiki.id!!,
            title = wiki.title,
            content = wiki.content
        )
    }
}