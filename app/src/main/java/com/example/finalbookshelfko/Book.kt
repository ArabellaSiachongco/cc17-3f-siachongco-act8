package com.example.finalbookshelfko

data class Book(
    val id: String,
    val volumeInfo: VolumeInfo
)

data class ImageLinks(
    val thumbnail: String?
)

data class VolumeInfo(
    val title: String,
    val imageLinks: ImageLinks?
)

data class BookSearchResponse(
    val items: List<Book>
)