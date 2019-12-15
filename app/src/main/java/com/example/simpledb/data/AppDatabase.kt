package com.example.simpledb.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(People::class),version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun PeopleDao() : PeopleDao

}