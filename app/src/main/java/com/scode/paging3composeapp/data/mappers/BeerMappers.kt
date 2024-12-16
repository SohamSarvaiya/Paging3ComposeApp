package com.scode.paging3composeapp.data.mappers

import com.scode.paging3composeapp.data.local.BeerEntity
import com.scode.paging3composeapp.data.remote.BeerDto
import com.scode.paging3composeapp.domain.Beer


fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}