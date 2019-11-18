package com.nakhmadov.footballapp.data.db.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.nakhmadov.footballapp.data.db.models.FavoriteCompetition
import com.nakhmadov.footballapp.data.db.models.FavoriteTeam

@Dao
interface FavoriteDao {

    @Insert(onConflict = REPLACE)
    fun insertFavoriteCompetition(favoriteCompetition: FavoriteCompetition)

    @Query("select count(competitionId) from favorite_competition where competitionId = :competitionId")
    fun favoriteCompetitionCount(competitionId: Int): Int

    @Insert(onConflict = REPLACE)
    fun insertFavoriteTeam(favoriteTeam: FavoriteTeam)

    @Query("select count(teamId) from favorite_team where teamId = :teamId")
    fun favoriteTeamCount(teamId: Int): Int
}