package com.open3r.openwiki.domain.wiki.repository

import com.open3r.openwiki.domain.wiki.domain.Wiki
import org.springframework.data.jpa.repository.JpaRepository

interface WikiRepository: JpaRepository<Wiki, Long> {
}