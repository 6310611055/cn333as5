package com.example.contact.domain.model

import com.example.contact.database.TagDbModel

data class TagModel(
    val id: Long,
    val name: String,
) {
    companion object {
        val DEFAULT = with(TagDbModel.DEFAULT_TAG) { TagModel(id, name) }
    }
}
