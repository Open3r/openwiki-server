package com.open3r.openwiki.domain.wiki.service

import com.open3r.openwiki.domain.wiki.domain.Wiki
import com.open3r.openwiki.domain.wiki.dto.request.WikiCreateRequest
import com.open3r.openwiki.domain.wiki.dto.response.WikiResponse
import com.open3r.openwiki.domain.wiki.repository.WikiRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class WikiServiceImpl(
    private val wikiRepository: WikiRepository
): WikiService {
    @Transactional(readOnly = true)
    override fun getWikis(): List<WikiResponse> {
        return wikiRepository.findAll().map { WikiResponse.of(it) }
    }

    @Transactional(readOnly = true)
    override fun getWiki(wikiId: Long): WikiResponse {
        val wiki = wikiRepository.findByIdOrNull(wikiId) ?: throw IllegalArgumentException("Wiki not found")

        return WikiResponse.of(wiki)
    }

    @Transactional
    override fun createWiki(request: WikiCreateRequest) {
        val wiki = Wiki(
            title = request.title,
            content = request.content
        )

        wikiRepository.save(wiki)
    }

    @Transactional
    override fun deleteWiki(wikiId: Long) {
        wikiRepository.deleteById(wikiId)
    }
}