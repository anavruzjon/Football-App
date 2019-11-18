package com.nakhmadov.footballapp.data.db.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_team")
data class FavoriteTeam(
    @PrimaryKey
    val teamId: Int = 0
)