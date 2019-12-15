package com.example.simpledb

import android.app.Application
import androidx.room.Room
import com.example.simpledb.data.AppDatabase

class App : Application() {
    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()


        db = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java,
            "simple-database"
            ).build()
        }
    }
//dddad