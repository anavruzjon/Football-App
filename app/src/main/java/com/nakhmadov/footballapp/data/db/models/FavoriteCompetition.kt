package com.nakhmadov.footballapp.data.db.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_competition")
data class FavoriteCompetition(
    @PrimaryKey
    val competitionId: Int = 0
)