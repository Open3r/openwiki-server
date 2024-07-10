package com.open3r.openwiki.domain.wiki.domain

import com.open3r.openwiki.global.common.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "wiki")
class Wiki(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "title")
    val title: String,

    @Column(name = "content")
    val content: String
): BaseEntity()