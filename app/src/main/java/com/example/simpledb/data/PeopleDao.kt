package com.example.simpledb.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import org.intellij.lang.annotations.JdkConstants

@Dao
interface PeopleDao {


    @Insert
    fun insertPeople(people: People): Long

    @Delete
    fun deletePeople(people: People)

    @Query("SELECT * FROM people")
    fun getAll(): List<People>

}