package ru.netology

import java.util.*

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromInt: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val comments: Objects,
    val copyright: Objects,
    val likes: Objects,
    val reposts: Objects,
    val views: Objects,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Objects,
    val postponedId: Int
)
