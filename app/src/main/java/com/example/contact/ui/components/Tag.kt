package com.example.contact.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.contact.domain.model.TagModel

@Composable
fun Tag(
    tag: TagModel,
) {
    val icons: List<ImageVector> = listOf(
        Icons.Rounded.AccountCircle,
        Icons.Rounded.Phone,
        Icons.Rounded.Home,
        Icons.Rounded.Place
    )
    Icon(
        icons[tag.id.toInt()],
        contentDescription = tag.name
    )
}